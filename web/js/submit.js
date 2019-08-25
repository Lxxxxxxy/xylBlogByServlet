function hc(){
	var aa=document.getElementById("search").value;
		if(aa=='')
		{
			alert("搜索内容不能为空！");
			return false;
		}
		else
		{
       		 return true;
        }
};
function pl1(){
	var word = document.getElementById('text1').value;
	var word1 = document.getElementById('name').value;
    if(word==''&&word1=='')
	{
		alert("评论和昵称不能为空！");
		return false;
	}
	if(word=='')
	{
		alert("评论不能为空！");
		return false;
	}
	if(word1=='')
	{
		alert("昵称不能为空！");
		return false;
	}
};
window.onscroll = function (){ 
if (document.documentElement.scrollTop+document.body.scrollTop>100)
	document.getElementById("button").style.display="block";
else
	document.getElementById("button").style.display="none";
};
function t(){
	var top=document.getElementById("button");
	top.style.backgroundColor="#D1D1D1";
};
function o(){
	var top=document.getElementById("button");
	top.style.backgroundColor="#EAEAEA";
};