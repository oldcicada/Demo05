var id=$('id').val();
$('#fjxx > a').click(function(){
		$.confirm({
		    title: '文件上传',
		    content: '<input type="file"/>',
		    confirm: function(){
		        $.alert('Confirmed!');
		    },
		    cancel: function(){
		        $.alert('Canceled!')
		    }
		});
});