$(function() {
	// Waves初始化
	Waves.displayEffect();
	// 输入框获取焦点后出现下划线
	$('.form-control').focus(function() {
		$(this).parent().addClass('fg-toggled');
	}).blur(function() {
		$(this).parent().removeClass('fg-toggled');
	});
});
Checkbix.init();
$(function() {
	// 点击登录按钮
	$('#login-bt').click(function() {
		login();
	});
	// 回车事件
	$('#username, #password').keypress(function (event) {
		if (13 == event.keyCode) {
			login();
		}
	});
	
	checkIsRememberPassword()
	
});
function checkIsRememberPassword(){
	var account = localStorage.getItem("account");
	if(account != null){
		$('#username').val(account);
		$('#password').val(localStorage.getItem('password'));
		$('#rememberMe').attr('checked','checked')
	}else{
		$('#username').val('');
		$('#password').val('');
	}
}
// 登录
function login() {
	$.ajax({
		url: BASE_PATH + '/user/login',
		type: 'POST',
		data: {
			account: $('#username').val(),
			password: $('#password').val()
		},
		beforeSend: function() {

		},
		success: function(json){
			if (json.status == 1) {
				loginSuccessAfter(json.data);
			} else {
				alert(json.msg);
			}
		},
		error: function(error){
			console.log(error);
		}
	});
}
function loginSuccessAfter(data){
	localStorage.setItem("user",JSON.stringify(data));
	var isChecked = $('#rememberMe').is(':checked');
	if(isChecked){
		localStorage.setItem('account',$('#username').val());
		localStorage.setItem('password',$('#password').val());
	}else{
		localStorage.removeItem('account');
		localStorage.removeItem('password');
	}
	location.href = "index.html";
}
