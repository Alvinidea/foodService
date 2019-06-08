
function isLZero(val) {
    if(val == "" || val == 'null'||val == 'undefined')
        return true;
    else
        return false;

}

function validateId(val) {
    if(/^[0-9a-zA-Z_]{6,15}$/.test(val) )
    {
        return true;
    }else
        return false;
}

function validatePwd(val) {

    if(/^[0-9a-zA-Z_]{6,15}$/.test(val) )
    {
        return true;
    }else
        return false;
}


function isValidDecimal( chars ) {
    var re=/^\d*\.?\d{1,2}$/;
    if (chars.match(re) == null)
        return false;
    else
        return true;
}
function validatePrice(val) {
    if( isValidDecimal( val ) && val <= 100 )
        return true;
    else
        return false;
}

function validateDiscount(val) {
    if( !isNaN(val) && val <= 10 && val >0 )
        return true;
    else
        return false;
}

function validateStar(val) {
    if( !isNaN(val) && val >0  && val < 5)
        return true;
    else
        return false;
}


function validateLevel(val) {

    if( !isNaN(val) && val > 0 && val < 10 )
        return true;
    else
        return false;
}

//验证邮箱格式的合法性
function validateEmail(val){

    if (val != '') {//判断
        var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
        if (!reg.test(val)) {
//            alert('邮箱格式不正确，请重新填写!');
            return false;
        }else{
            return true;
        }
    }
}
//验证手机号码的合法性
function validateMobile(val) {
    var mobile = /^(13[0-9]{9})|(18[0-9]{9})|(14[0-9]{9})|(17[0-9]{9})|(15[0-9]{9})$/;
    if(val.length>0){
        return mobile.test(val);
    }else{
        return false;
    }
}