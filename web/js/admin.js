function time1(){
	var time=document.getElementById("time1");
	var hour=new Date();
	var min=new Date();
	var sec=new Date();
	hour=hour.getHours();
	min=min.getMinutes();
	sec=sec.getSeconds();
	if(hour>=6&&hour<=12)
		time.innerHTML="，早上好。";
	if(hour>=12&&hour<=14)
		time.innerHTML="，中午好。";
	if(hour>=14&&hour<=18)
		time.innerHTML="，下午好。";
	if(hour>=18&&hour<=20)
		time.innerHTML="，傍晚好。";
	if(hour>=20&&hour<=24)
		time.innerHTML="，晚上好。";
	if(hour>=0&&hour<=6)
		time.innerHTML="，凌晨好。";
};
function bg1(){
	var bg1=document.getElementById("bg1");
	bg1.style.backgroundColor="white";
};
function bg11(){
	var bg1=document.getElementById("bg1");
	bg1.style.backgroundColor="silver";
};
function bg2(){
	var bg1=document.getElementById("bg2");
	bg1.style.backgroundColor="white";
};
function bg22(){
	var bg1=document.getElementById("bg2");
	bg1.style.backgroundColor="silver";
};
function bg3(){
	var bg1=document.getElementById("bg3");
	bg1.style.backgroundColor="white";
};
function bg33(){
	var bg1=document.getElementById("bg3");
	bg1.style.backgroundColor="silver";
};
function bg4(){
	var bg1=document.getElementById("bg4");
	bg1.style.backgroundColor="white";
};
function bg44(){
	var bg1=document.getElementById("bg4");
	bg1.style.backgroundColor="silver";
};
function fb1(){
	var word = document.getElementById('text1').value;
	var word1 = document.getElementById('Qing_input').value;
    if(word==''&&word1=='')
	{
		alert("标题和内容不能为空！");
		return false;
	}
	if(word=='')
	{
		alert("标题不能为空！");
		return false;
	}
	if(word1=='')
	{
		alert("内容不能为空！");
		return false;
	}
};
function mm1(){
	var mm=document.getElementById('yzmm');
	if(mm.style.display=="none")
		mm.style.display="block";
	else
		mm.style.display="none";
};