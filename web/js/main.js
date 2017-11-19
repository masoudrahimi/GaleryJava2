function confirm()
{
    if(document.getElementById("usn").value != "" && document.getElementById("pass").value != "")

        return true;
    else {
        alert("please fill text boxes");
        return false;
    }
}