	var id=$('#id').val();
	$('#fjxx > a').confirm({
			    title: '文件上传',
			    content: '<input type="file" id="file"/>',
			    confirm: function(){
			        $.alert('Confirmed!');
			    },
			    cancel: function(){
			        $.alert('Canceled!')
			    }
			});