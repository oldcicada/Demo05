var Role = function() {
    var handleRoleSub = function() {
        $('#roleForm').validate({
            errorElement: 'span', //default input error message container
            errorClass: 'help-block', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            rules: {
                name: {
                    required: true
                }
            },

            messages: {
                username: {
                    required: "角色名称必须填写."
                }
            },

            invalidHandler: function(event, validator) {   
                $('.alert-danger', $('#roleForm')).show();
            },

            highlight: function(element) {
                $(element)
                    .closest('.form-group').addClass('has-error'); 
            },

            success: function(label) {
                label.closest('.form-group').removeClass('has-error');
                label.remove();
            },

            errorPlacement: function(error, element) {
                error.insertAfter(element.closest('.input-icon'));
            },

            submitHandler: function(form) {
            	//选中
            	testCheck();
                form.submit(); // form validation success, call ajax form submit
            }
        });

        $('#roleForm input').keypress(function(e) {
            if (e.which == 13) {
                if ($('#roleForm').validate().form()) {
                    $('#roleForm').submit(); //form validation success, call ajax form submit
                }
                return false;
            }
        });
    }
    
    function testCheck(){
		var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
		var nodes = treeObj.getCheckedNodes(true);
		var nodestr="";
		$(nodes).each(function(index,element){
			nodestr+=element.id+",";
		  });
		$('#checkCodes').val(nodestr);
	}

    return {
        init: function() {
        	handleRoleSub();
        }

    };

}();