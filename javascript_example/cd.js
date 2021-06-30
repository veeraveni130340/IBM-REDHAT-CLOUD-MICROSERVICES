class CD 
{
    _cd;
    _cdName;

    constructor(_cdId,_cdName){
        console.log('cd constructor called');
        this._cdId=_cdId;
        this._cdName=_cdName;
    }
    getDetails(){
        return 'cd id: '+this._cdId+' cd name'+this._cdName;
    }
}
class specialEditionCD extends CD{
    _specialFeature;

    constructor(_specialFeature){
        super(100,'wow');
        this._specialFeature=_specialFeature;
        console.log('special edition cd constructor called');

    }
    getDetails(){
        return super.getDetails()+ 'special feature is: '+this._specialFeature;
    }

}
class internationalCd extends CD{
    _specialPlace;

    constructor(_specialPlace){
        super(100,'wow');
        this._specialPlace=_specialPlace;
        console.log('special place constructor called');
    }
    getDetails(){
        return super.getDetails()+ 'special place is: '+this._specialPlace;
    }

}
let _cd1=new specialEditionCD('3D');
console.log(_cd1.getDetails());
let _cd2=new specialEditionCD('rjy');
console.log(_cd2.getDetails());