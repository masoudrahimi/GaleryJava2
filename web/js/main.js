function confirm()
{
    if(document.getElementById("usn").value != "" && document.getElementById("pass").value != "")

        return true;
    else {
        alert("please fill text boxes");
        return false;
    }
}
//function register admin
function openreg(evt, oprationName) {
    var i, tabcontent, tablinks;
    tabcontent = document.getElementsByClassName("tabcontent");
    for (i = 0; i < tabcontent.length; i++) {
        tabcontent[i].style.display = "none";
    }
    tablinks = document.getElementsByClassName("tablinks");
    for (i = 0; i < tablinks.length; i++) {
        tablinks[i].className = tablinks[i].className.replace(" active", "");
    }
    document.getElementById(oprationName).style.display = "block";
    evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();


//page register
function Myclick() {
 // if(document.getElementById("name").value===""|| document.getElementById("lname").value===""||
 //    document.getElementById("uname").value===""
 //     || document.getElementById("pass").value===""||document.getElementById("cpass").value===""||
 //     document.getElementById("ans1").value===""||
 //    document.getElementById("ans2")==="" ){
 //    ddocument.getElementById("name").style.borderColor="red";
 //     document.getElementById("lname").style.borderColor="red";
 //    document.getElementById("uname").style.borderColor="red";
 //
 //    document.getElementById("pass").style.borderColor="red";
 //    document.getElementById("cpass").style.borderColor="red";
 //     document.getElementById(ans1).style.borderColor="red";
 //        document.getElementById("ans2").style.borderColor="red";
 //     alert("please fill text boxes");
 //
 //
 // }else
    alert("register successful");

}
function myFunction() {
    var x = document.createElement("INPUT");
    x.setAttribute("type", "file");
    document.body.appendChild(x);
}