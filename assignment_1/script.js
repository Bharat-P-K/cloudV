var selectedRow = null;

function onFormSubmit(e) {
	event.preventDefault();
        var formData = readFormData();
        if (selectedRow == null){
            insertNewRecord(formData);
		}
        else{
            updateRecord(formData);
		}
        resetForm();    
}

//Retrieve the data
function readFormData() {
    var formData = {};
    
    formData["firstname"] = document.getElementById("firstname").value;
    formData["lastname"] = document.getElementById("lastname").value;
    formData["city"] = document.getElementById("city").value;
    formData["country"] = document.getElementById("country").value;
    return formData;
}

//Insert the data
function insertNewRecord(data) {
    var table = document.getElementById("storeList").getElementsByTagName('tbody')[0];
    var x = document.getElementById("storeList").rows.length;
    var newRow = table.insertRow(table.length);
    
    cell1 = newRow.insertCell(0);
    cell1.innerHTML =x;
    cell1 = newRow.insertCell(1);
		cell1.innerHTML = data.firstname;
    cell2 = newRow.insertCell(2);
		cell2.innerHTML = data.lastname;
    cell3 = newRow.insertCell(3);
		cell3.innerHTML = data.city;
    cell4 = newRow.insertCell(4);
		cell4.innerHTML = data.country;
   
}
function resetForm() {
    document.getElementById("firstname").value = '';
    document.getElementById("lastname").value = '';
    document.getElementById("city").value = '';
    document.getElementById("country").value = '';
    selectedRow = null;
}