require(['./common'], function (common) {
    require(['jquery'],function($){
      $('ul li').click(function(){
          console.log(123)
      })
    })
});