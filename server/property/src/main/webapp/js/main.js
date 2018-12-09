// The root URL for the RESTful services
var rootURL = "http://localhost:8080/property/webapi/";

// Retrieve property details list when application starts 
listAll();

function listAll() {
	console.log('listAll');
	$.ajax({
		type: 'GET',
		url: rootURL,
		dataType: "json", // data type of response
		success: renderList
	});
}

function renderList(data) {
	// JAX-RS serializes an empty list as null, and a 'collection of one' as an object (not an 'array of one')
	var list = data == null ? [] : (data instanceof Array ? data : [data]);
}

function renderDetails(propertyDetails) {
	$('#floorName').val(propertyDetails.floorName);
	$('#floorArea').val(propertyDetails.floorArea);
	$('#buildingName').val(propertyDetails.buildingName);
}

// Helper function to serialize all the form fields into a JSON string
function formToJSON() {
	return JSONfloorArea.stringify({
		"floorName": $('#floorName').val(), 
		"floorArea": $('#floorArea').val(),
		"buildingName": $('#buildingName').val()
		});
}

