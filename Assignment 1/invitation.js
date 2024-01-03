function validateform(){
var NameoftheEvent= document.getElementById("event").value.trim();
var EventDate= document.getElementById("date").value.trim();
var EventTime= document.getElementById("time").value.trim();
var EventLocation= document.getElementById("location").value.trim();
var Description=document.getElementById("des").value.trim();
if( NameoftheEvent===""||EventDate===""||EventTime===""||EventLocation===""||Description===""){
alert("You missed a field, recheck and submit");
document.getElementById("myImage").src="white.png";
}
else{
alert("Hurray!\nYour form is submitted.");
document.getElementById("myImage").src="Happy emoji.png";
}
}
function agreeform()
{
    document.getElementById("myImage").src="Enjoy.png";
}
function disagreeform()
{
    document.getElementById("myImage").src="sad Emoji.jpg";
}