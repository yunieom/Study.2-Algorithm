/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    if(s.length===1) {
        return true;
    }
    let left;
    let right;

    
    const reg = /[\{\}\[\]\/?.,;:|\)*~`!^\-_+<>@\#$%&\\\=\(\'\"]/gi; // 정규식
    let str = s.replace(reg,''); // 특수문자 제거
    str = str.toLowerCase().replace(/\s/g,''); //소문자 통일 & 공백제거

    
    if(str.length%2 === 0) {
        left = str.substring(0,str.length/2);
        right = str.substring(str.length/2,str.length).split('').reverse().join('');      
        
        if(left===right) {
            return true;
        }else {
            return false;
        }
           
    }else {
        left = str.substring(0,str.length/2);
        right = str.substring(str.length/2+1,str.length).split('').reverse().join('');
        
        if(left===right) {
            return true;
        }else {
            return false;
        }
    }

    
};