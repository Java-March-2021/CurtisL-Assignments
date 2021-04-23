package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Answer;
import com.example.demo.models.Question;
import com.example.demo.models.Tag;
import com.example.demo.repositories.AnswerRepository;
import com.example.demo.repositories.QuestionRepository;
import com.example.demo.repositories.TagRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private AnswerRepository aRepo;
	@Autowired
	private TagRepository tRepo;
	
	public Question saveQuestion(Question question) {
		return qRepo.save(question);
	}
	
	public Answer saveAnswer(Answer answer) {
		return aRepo.save(answer);
	}
	
	public Tag saveTag(Tag tag) {
		return tRepo.save(tag);
	}
	
	public Question findQuestionById(Long id) {
		return qRepo.findById(id).orElse(null);
	}
	
	public Answer findAnswerById(Long id) {
		return aRepo.findById(id).orElse(null);
	}
	
	public Tag findTagById(Long id) {
		return tRepo.findById(id).orElse(null);
	}
}
