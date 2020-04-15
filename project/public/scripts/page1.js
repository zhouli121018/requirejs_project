require(['./common'], function (common) {
    require(['sayPage1'], function (sayPage1) {
        sayPage1.hello();
    });
});