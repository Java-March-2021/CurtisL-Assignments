var url = windows.location.pathname;
var page = url.url.substring(url.lastIndexOf('/')+1);
function templateAlert(page) {
	alert(`this ${page} template is loaded`);
}