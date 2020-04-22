require(['./common'], function (common) {
    // require(['sayPage1'], function (sayPage1) {
    //     sayPage1.hello();
    // });
    require(['sayPage1','text!../../views/user.html!strip'],function(sayPage1,template){
        sayPage1.hello();
        $('#add_list_btn').click(function(){
            $('body').append(template)
        })
        
    })
});