define(['jquery'], function($) {
    function sayHi(){
        $('body').append('<h1>Hello page2!</h1>');
    }
    return {
        hello: sayHi
    }
});