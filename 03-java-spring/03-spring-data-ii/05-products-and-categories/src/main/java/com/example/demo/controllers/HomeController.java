package com.example.demo.controllers;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.models.Category;
import com.example.demo.models.Product;
import com.example.demo.services.CategoryService;
import com.example.demo.services.ProductService;

@Controller
public class HomeController {

	@Autowired
	private ProductService service;
	@Autowired
	 private CategoryService cService;

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("newProduct")
	public String newProduct(@ModelAttribute("product")Product product) {
	
		return"Products/new.jsp";
	}
	
	@PostMapping("newProduct")
	public String createProduct(@Valid @ModelAttribute("product")Product product,BindingResult result,RedirectAttributes redirect){
		if(result.hasErrors()) {
			return"Products/new.jsp";
		}
			service.create(product);
			redirect.addAttribute("id",product.getId());
			return"redirect:Product/{id}";
	}
	
	
	@GetMapping("/Product/{id}")
	public String showProduct(@PathVariable("id")Long id,Model model,@ModelAttribute("category")Category cat) {
		 Product product = service.findById(id);
			
		model.addAttribute("product",product);
		model.addAttribute("categories",product.getCategories());
		model.addAttribute("cats",cService.findByProductNotContain(product));
		return"Products/product.jsp";
	}
	
	@PostMapping("/Product/{id}")
	public String addCategory(@Valid @ModelAttribute("category")Category category,BindingResult result,RedirectAttributes redirect,@PathVariable("id")Long id,Model model) {
			if(result.hasErrors()) {
				 
				return"index.jsp";
			}
			System.out.println(category.getName());
			Product product = service.findById(id);
			List<Category> clist = product.getCategories();
			clist.add(category);
			   
			service.update(product);
			redirect.addAttribute("id",product.getId());
			return"redirect:/Product/{id}";
		
		
	}
	
	@GetMapping("newCategory")
	public String newCategory(@ModelAttribute("category")Category category) {
		return"Categories/new.jsp";
	}
	
	@PostMapping("newCategory")
	public String createCategory(@Valid @ModelAttribute("category")Category category,BindingResult result,RedirectAttributes redirect){
		if(result.hasErrors()) {
			return"Categories/new.jsp";
		}
			cService.create(category);
			redirect.addAttribute("id",category.getId());
			return"redirect:Categories/{id}";
	}
	
	@GetMapping("/Categories/{id}")
	public String CatProducts(@PathVariable("id")Long id,@ModelAttribute("product")Product pod,Model model) {
		Category category = cService.findById(id);
		
		model.addAttribute("category",category);
		model.addAttribute("pats",service.findByCategoryNotContain(category));
		return"Categories/category.jsp";
	}
	
	@PostMapping("/Category/{id}")
	public String addProduct(@Valid @ModelAttribute("product")Product pod,BindingResult result,RedirectAttributes redirect,@PathVariable("id")Long id,Model model) {
			if(result.hasErrors()) {
				 
				return"index.jsp";
			}
			Category category = cService.findById(id);
			List<Product> plist = category.getProducts();
			plist.add(pod);
			cService.update(category);
			redirect.addAttribute("id",category.getId());
			return"redirect:/Categories/{id}";

	}
	
}
