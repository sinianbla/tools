
var login = new Vue({
	el : "#login",
	data : {
		loginName : "admin",
		password : "admin@123"
	},
	methods : {
		login:function(){
			axios.get(
               "http://localhost:7080/tools/user/login"
            ).then(function(resp){
                console.log("页面跳转。。。。。");
                debugger
                var loginDiv = document.getelementbyid("login");
                var loginInfoDiv = document.getelementbyid("loginInfo");
                var userInfoP = document.getelementbyid("userInfo");
                loginDiv.style.display="none";
                userInfoP.text(resp.data.loginName);
                
//                window.location.href="http://localhost:7080/tools/user/list";
            }).catch(resp => {
                console.log('请求失败：'+resp.status+','+resp.statusText);
            });
		}
	}
})