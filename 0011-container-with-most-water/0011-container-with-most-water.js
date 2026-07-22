var maxArea = function(height) {
    let i = 0;
    let j = height.length-1;
    let maxarea =0;
    
    while(i<j){
        let mh = Math.min(height[i] , height[j]);
        let d = j-i;
        let area = mh * d;
        maxarea = Math.max(maxarea, area);
        if(height[i] < height[j]){
            i++;
        }
        else{
            j--;
        }
        
    }
    return maxarea;  
};