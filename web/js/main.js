function confirm()
{
    if(document.getElementById("usn").value != "" && document.getElementById("pass").value != "")

        return true;
    else {
        alert("please fill text boxes");
        return false;
    }
}

function confirmRegister(event)
{
    if(document.getElementById("name").value != "" && document.getElementById("lname").value != ""
        && document.getElementById("pass").value != "" && document.getElementById("cpass").value != ""
        && document.getElementById("uname").value != "" && document.getElementById("ans1").value != ""
        && document.getElementById("ans2").value != "" &&
        (document.getElementById("pass").value == document.getElementById("cpass").value ) &&
        (document.getElementById("q1").value != document.getElementById("q2").value )) {
        return true;
    }
    else {
        alert("please checked entries!!!");
        event.preventDefault();
    }
}

function confirmForget(event)
{
    if(document.getElementById("uname").value != "" &&
        document.getElementById("npass").value != "" && document.getElementById("confpass").value != "" &&
        document.getElementById("ans1").value != "" && document.getElementById("ans2").value != "" &&
        (document.getElementById("pass").value == document.getElementById("cpass").value ) &&
        !(document.getElementById("questions1").value == document.getElementById("questions2").value ) )
    {
        return true;
    }
    else
    {
        alert("please checked entries!!!");
        event.preventDefault();
    }
}
