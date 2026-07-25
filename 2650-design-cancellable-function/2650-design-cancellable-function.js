var cancellable = function(generator) {
    var cancelled = false;
    var cancel;
    const cancelPromise = new Promise((_, reject) => cancel = () => {
            cancelled = true;
            reject("Cancelled");
        });
    
    const promise = (async () => {
        let next = generator.next();
        while (!cancelled && !next.done) {
            try {
                next = generator.next(await Promise.race([next.value, cancelPromise]));
            } catch (e) {
                next = generator.throw(e);
            }
        }

        return next.value;
    })();
    return [cancel, promise];
};