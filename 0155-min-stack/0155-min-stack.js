var MinStack = function() {
    this.array = [];
};

/** 
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
    this.array.push(val);
   
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
    this.array.pop();
    
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
    
    return  this.array.at(-1);
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
    let min = this.array[0];
    for(n of this.array) {
        min = Math.min(min, n);
    }
    return min;
    
};

/** 
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */