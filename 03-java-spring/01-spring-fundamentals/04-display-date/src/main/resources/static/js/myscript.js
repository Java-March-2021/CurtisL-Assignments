/**
 * 
 */
var url = window.location.pathname;
var page = url.substring(url.lastIndexOf('/')+1);
console.log(page)
function templateAlert(page) {
	alert(`this ${page} template is loaded`);
}