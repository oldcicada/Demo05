var flag = true
function inputAction1() {
	var name = $("#name").val();
	var ret = /^[a-zA-Z0-9_-]{2,16}$/;
	      if(ret.test(name)){
	       flag=true
	      }else{
	       flag=false
	      }
	
	if(flag){
		$("#form-group1").removeClass("has-error");
		$("#form-group1").addClass("has-success");
		$("#iconInput1").removeClass("glyphicon-remove")
		$("#iconInput1").addClass("glyphicon-ok")
		
	}else{

		$("#form-group1").removeClass("has-success");
		$("#form-group1").addClass("has-error");
		$("#iconInput1").removeClass("glyphicon-ok")
		$("#iconInput1").addClass("glyphicon-remove")
	}
}

function inputAction2() {
	var password = $("#password").val();
	var ret = /^.{6}$/;
	      if(ret.test(password)){
	       flag=true
	      }else{
	       flag=false
	      }
	
	if(flag){
		$("#form-group2").removeClass("has-error");
		$("#form-group2").addClass("has-success");
		$("#iconInput2").removeClass("glyphicon glyphicon-remove form-control-feedback")
		$("#iconInput2").addClass("glyphicon glyphicon-ok form-control-feedback")
		
	}else{

		$("#form-group2").removeClass("has-success");
		$("#form-group2").addClass("has-error");
		$("#iconInput2").removeClass("glyphicon glyphicon-ok form-control-feedback")
		$("#iconInput2").addClass("glyphicon glyphicon-remove form-control-feedback")
	}
}
