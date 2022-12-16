var presentrow= null;
function onFormSubmit(e) {
event.preventDefault();
var inputData=readFormData();
display(inputData);
resetForm();

}


//Retrieve the data
function readFormData() {
    var formData = {};
    formData["sentence"] = document.getElementById("sentence").value;
    formData["letter"] = document.getElementById("letter").value;
    return formData;
}

function display(data){
    var table = document.getElementById("storeList").getElementsByTagName('tbody')[0];
    var newRow = table.insertRow(table.length);
    cell0 = newRow.insertCell(0);
    cell0.innerHTML=data.sentence;
    cell1 = newRow.insertCell(1);
    cell1.innerHTML=data.letter;
    cell2 = newRow.insertCell(2);
    if (data.sentence.includes(data.letter)){
    cell2.innerHTML=data.sentence.substring(data.sentence.indexOf(data.letter)+1);
    }
    else {
        cell2.innerHTML="The letter does not exist in the sentence";
    }
}

function resetForm() {
    document.getElementById("sentence").value = '';
    document.getElementById("letter").value = '';
    presentrow = null;
}