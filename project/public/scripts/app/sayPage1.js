define(['jquery'], function($) {
    function sayHi(){
        $('body').append('<h1>Hello page1!</h1>');
    }
    return {
        hello: sayHi
    }
});