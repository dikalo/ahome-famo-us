define(function(require, exports, module) {
var $moduleName, $moduleBase;
var $wnd = $wnd || window.parent; $doc = $wnd.document; 
var $gwt_version = "2.6.0";function o(){}
function je(){}
function ge(){}
function Qb(){}
function Yb(){}
function tc(){}
function Fd(){}
function Bb(a){}
function Qd(a,b){}
function rc(){gc()}
function pb(){jc(gc())}
function ie(){new ge}
function Gb(){return Db}
function Ad(){return !!$stats}
function Md(){pb.call(this)}
function Od(){pb.call(this)}
function H(){u();v.call(this)}
function v(){this.b=this.e()}
function fb(a){this.b=a}
function ib(a){this.b=a}
function rb(){rb=je;qb=new o}
function Nb(){Nb=je;Mb=new Qb}
function Dd(){Dd=je;new ge;new ie}
function zd(a){return new xd[a]}
function Td(b,a){return b.indexOf(a)}
function Ib(a,b){return sc(a,b,null)}
function $d(a){return vc(rd,ne,1,a,0)}
function Ub(a){return parseInt(a)||-1}
function Ud(b,a){return b.lastIndexOf(a)}
function Cc(a,b){return a.cM&&!!a.cM[b]}
function Fc(a,b){return a!=null&&Cc(a,b)}
function Yd(c,a,b){return c.substr(a,b-a)}
function vb(b,a){b[b.length]=a}
function r(a){if(!a){return}}
function Jb(a){$wnd.clearTimeout(a)}
function Q(a){v.call(this);this.b=a}
function N(a){J();L.call(this);this.b=a}
function V(){T();L.call(this);this.b=U()}
function bb(){Y();H.call(this);this.b=Z()}
function jc(){var a;a=hc(new rc);lc(a)}
function K(c,a){var b=c.d();b.setContent(a)}
function Id(a){var b=xd[a.b];a=null;return b}
function Xb(){try{null.a()}catch(a){return a}}
function Rb(a,b){!a&&(a=[]);a[a.length]=b;return a}
function Vb(a,b){a.length>=b&&a.splice(0,b);return a}
function Ab(a,b,c){return a.apply(b,c);var d}
function Vd(c,a,b){return c.lastIndexOf(a,b)}
function Xd(b,a){return b.substr(a,b.length-a)}
function _d(a){return String.fromCharCode(a)}
function Jd(a){return typeof a=='number'&&a>0}
function Z(){return new $wnd.aitFamoModifier}
function U(){return new $wnd.aitFamoImageSurface}
function gc(){gc=je;Error.stackTraceLimit=128}
function zc(){zc=je;xc=[];yc=[];Ac(new tc,xc,yc)}
function sb(a){rb();pb.call(this);this.b=a;ic(new rc,this)}
function L(){J();u();H.call(this);this.b=q();this.b=this.e()}
function Hb(a){$wnd.setTimeout(function(){throw a},0)}
function Kb(){return Ib(function(){xb!=0&&(xb=0);zb=-1},10)}
function Fb(a){a&&Pb((Nb(),Mb));--xb;if(a){if(zb!=-1){Jb(zb);zb=-1}}}
function ic(a,b){var c;c=kc(a,b.b===(rb(),qb)?null:b.b);lc(c)}
function Eb(a,b,c){var d;d=Cb();try{return Ab(a,b,c)}finally{Fb(d)}}
function Hd(a,b,c){var d;d=new Fd;Jd(c)&&Kd(c,d);return d}
function vc(a,b,c,d,e){var f;f=uc(e,d);wc(a,b,c,f);return f}
function wc(a,b,c,d){zc();Bc(d,xc,yc);d.cZ=a;d.cM=b;return d}
function Gd(a,b,c){var d;d=new Fd;Jd(c!=0?-c:0)&&Kd(c!=0?-c:0,d);return d}
function Dc(a,b){if(a!=null&&!(a.cM&&a.cM[b])){throw new Md}return a}
function Ec(a){if(a!=null&&(a.tM==je||Cc(a,1))){throw new Md}return a}
function Sd(a,b){if(!Fc(b,1)){return false}return String(a)==b}
function vd(a){if(Fc(a,8)){return a}return a==null?new sb(null):td(a)}
function F(e,a){var b=e.d();var c=a.d();var d=b.add(c);return new Q(d)}
function G(e,a){var b=e.d();var c=a.d();var d=b.add(c);return new Q(d)}
function gb(a){eb();var b=$wnd.aitFamoTransform.rotateY(a);return new fb(b)}
function eb(){eb=je;$wnd.aitFamoTransform=require('famous/core/Transform')}
function s(){s=je;$wnd.aitFamoEngine=require('famous/core/Engine')}
function J(){J=je;u();$wnd.aitFamoSurface=require('famous/core/Surface')}
function Y(){Y=je;u();$wnd.aitFamoModifier=require('famous/core/Modifier')}
function u(){u=je;$wnd.aitFamoEventHandler=require('famous/core/EventHandler')}
function T(){T=je;J();$wnd.aitFamoImageSurface=require('famous/surfaces/ImageSurface')}
function Db(b){return function(){try{return Eb(b,this,arguments)}catch(a){throw a}}}
function ab(d,b){var c=d.d();c.setTransform(function(){var a=b.f();return a.d()})}
function sc(a,b,c){var d=$wnd.setTimeout(function(){a();c!=null&&Bb(c)},b);return d}
function Ac(a,b,c){var d=0,e;for(var f in a){if(e=a[f]){b[d]=f;c[d]=e;++d}}}
function Bc(a,b,c){zc();for(var d=0,e=b.length;d<e;++d){a[b[d]]=c[d]}}
function $(a,b){var c,d,e,f,g;f=[];for(d=0,e=b.length;d<e;++d){c=b[d];vb(f,c)}g=a.d();g.setOrigin(f)}
function I(a,b){var c,d,e,f,g;c=[];for(e=0,f=b.length;e<f;++e){d=b[e];c[c.length]=d}g=a.d();g.setClasses(c)}
function ob(a){var b,c,d;c=vc(qd,ne,7,a.length,0);for(d=0,b=a.length;d<b;++d){if(!a[d]){throw new Od}c[d]=a[d]}}
function Ob(a){var b,c;if(a.b){c=null;do{b=a.b;a.b=null;c=Sb(b,c)}while(a.b);a.b=c}}
function Pb(a){var b,c;if(a.c){c=null;do{b=a.c;a.c=null;c=Sb(b,c)}while(a.c);a.c=c}}
function hc(a){var b;b=Vb(kc(a,Xb()),3);b.length==0&&(b=Vb((new Yb).h(),1));return b}
function ud(a){var b;if(Fc(a,2)){b=Dc(a,2);if(b.b!==(rb(),qb)){return b.b===qb?null:b.b}}return a}
function q(){if(typeof $wnd!='undefined'&&$wnd.Object){return new $wnd.Object}return {}}
function td(b){var c=b.__gwt$exception;if(!c){c=new sb(b);try{b.__gwt$exception=c}catch(a){}}return c}
function gwtOnLoad(b,c,d,e){$moduleName=c;$moduleBase=d;if(b)try{qe(sd)()}catch(a){b(c)}else{qe(sd)()}}
function kc(a,b){var c;c=cc(a,b);if(c.length==0){return (new Yb).j(b)}else{c[0].indexOf('anonymous@@')==0&&(c=Vb(c,1));return c}}
function Zd(c){if(c.length==0||c[0]>ye&&c[c.length-1]>ye){return c}var a=c.replace(/^(\s*)/,re);var b=a.replace(/\s*$/,re);return b}
function Cb(){var a;if(xb!=0){a=(new Date).getTime();if(a-yb>2000){yb=a;zb=Kb()}}if(xb++==0){Ob((Nb(),Mb));return true}return false}
function cc(a,b){var c,d,e,f;e=b!=null&&b.tM!=je&&!Cc(b,1)?Ec(b):null;f=e&&e.stack?e.stack.split('\n'):[];for(c=0,d=f.length;c<d;c++){f[c]=a.i(f[c])}return f}
function uc(a,b){var c=new Array(b);if(a==3){for(var d=0;d<b;++d){c[d]={l:0,m:0,h:0}}}else if(a>0&&a<3){var e=a==1?0:false;for(var d=0;d<b;++d){c[d]=e}}return c}
function Kd(a,b){var c;b.b=a;if(a==2){c=String.prototype}else{if(a>0){var d=Id(b);if(d){c=d.prototype}else{d=xd[a]=function(){};d.cZ=b;return}}else{return}}c.cZ=b}
function ae(a){var b,c;if(a>=65536){b=55296+(~~(a-65536)>>10&1023)&65535;c=56320+(a-65536&1023)&65535;return _d(b)+_d(c)}else{return String.fromCharCode(a&65535)}}
function Bd(a){return $stats({moduleName:$moduleName,sessionId:$sessionId,subSystem:'startup',evtGroup:'moduleStartup',millis:(new Date).getTime(),type:'onModuleLoadStart',className:a})}
function Sb(b,c){var d,e,f,g;for(e=0,f=b.length;e<f;e++){g=b[e];try{g[1]?g[0].l()&&(c=Rb(c,g)):g[0].l()}catch(a){a=vd(a);if(Fc(a,8)){d=a;Hb(Fc(d,2)?Dc(d,2).g():d)}else throw ud(a)}}return c}
function Tb(a){var b,c,d;d=re;a=Zd(a);b=a.indexOf(se);c=a.indexOf('function')==0?8:0;if(b==-1){b=Td(a,ae(64));c=a.indexOf('function ')==0?9:0}b!=-1&&(d=Zd(Yd(a,c,b)));return d.length>0?d:te}
function yd(a,b,c){var d=xd[a];if(d&&!d.cZ){_=d.prototype}else{!d&&(d=xd[a]=function(){});_=d.prototype=b<0?{}:zd(b);_.cM=c}for(var e=3;e<arguments.length;++e){arguments[e].prototype=_}if(d.cZ){_.cZ=d.cZ;d.cZ=null}}
function lc(a){var b,c,d,e,f,g,h,i,j;j=vc(qd,ne,7,a.length,0);for(e=0,f=j.length;e<f;e++){i=Wd(a[e],ue,0);b=-1;d='Unknown';if(i.length==2&&i[1]!=null){h=i[1];g=Ud(h,ae(58));c=Vd(h,ae(58),g-1);d=Yd(h,0,c);if(g!=-1&&c!=-1){Ub(Yd(h,c+1,g));b=Ub(Xd(h,g+1))}}j[e]=new Qd(i[0],d+ve+b)}ob(j)}
function Wd(l,a,b){var c=new RegExp(a,'g');var d=[];var e=0;var f=l;var g=null;while(true){var h=c.exec(f);if(h==null||f==re||e==b-1&&b>0){d[e]=f;break}else{d[e]=f.substring(0,h.index);f=f.substring(h.index+h[0].length,f.length);c.lastIndex=0;if(g==f){d[e]=f.substring(0,1);f=f.substring(1)}g=f;e++}}if(b==0&&l.length>0){var i=d.length;while(i>0&&d[i-1]==re){--i}i<d.length&&d.splice(i,d.length-i)}var j=$d(d.length);for(var k=0;k<d.length;++k){j[k]=d[k]}return j}
function sd(){var a,b,c,d,e,f,g,h;Ad()&&Bd('com.google.gwt.useragent.client.UserAgentAsserter');Ad()&&Bd('com.google.gwt.user.client.DocumentModeAsserter');Cd();Ad()&&Bd('com.ait.toolkit.famous.kitchensink.client.Ahome_pages_famous');(Dd(),$doc.body).style['backgroundColor']='black';a=new V;b=[];vb(b,250);vb(b,250);c=a.d();c.setSize(b);K(a,(d=$doc.location.href,e=d.indexOf('#'),e!=-1&&(d=d.substring(0,e)),e=d.indexOf('?'),e!=-1&&(d=d.substring(0,e)),e=d.lastIndexOf(we),e!=-1&&(d=d.substring(0,e)),d.length>0?d+we:re)+'ahome_logo.png');I(a,wc(rd,ne,1,['double-sided']));f=(new Date).getTime();g=new bb;$(g,wc(od,ne,-1,[0.5,0.5]));ab(g,new ib(f));F(G((s(),h=$wnd.aitFamoEngine.createContext(),new N(h)),g),a)}
function Cd(){var a,b,c;b=$doc.compatMode;a=wc(rd,ne,1,[xe]);for(c=0;c<a.length;c++){if(Sd(a[c],b)){return}}a.length==1&&Sd(xe,a[0])&&Sd('BackCompat',b)?"GWT no longer supports Quirks Mode (document.compatMode=' BackCompat').<br>Make sure your application's host HTML page has a Standards Mode (document.compatMode=' CSS1Compat') doctype,<br>e.g. by using &lt;!doctype html&gt; at the start of your application's HTML page.<br><br>To continue using this unsupported rendering mode and risk layout problems, suppress this message by adding<br>the following line to your*.gwt.xml module file:<br>&nbsp;&nbsp;&lt;extend-configuration-property name=\"document.compatMode\" value=\""+b+'"/&gt;':"Your *.gwt.xml module configuration prohibits the use of the current doucment rendering mode (document.compatMode=' "+b+"').<br>Modify your application's host HTML page doctype, or update your custom 'document.compatMode' configuration property settings."}
var re='',ye=' ',se='(',we='/',ve='@',ue='@@',xe='CSS1Compat',Ae='[Ljava.lang.',te='anonymous',Ce='com.ait.toolkit.famous.client.ui.',Be='com.google.gwt.core.client.',Ee='com.google.gwt.core.client.impl.',ze='java.lang.',De='java.util.';var _,xd={},ne={4:1},me={},pe={10:1},oe={4:1,8:1};yd(1,-1,me,o);_.tM=je;yd(3,1,{});_.d=function p(){r(this.b);return this.b};yd(7,3,{});_.e=function w(){return new $wnd.aitFamoEventHandler};yd(11,7,{});yd(10,11,{});yd(9,10,{});_.e=function M(){return new $wnd.aitFamoSurface};yd(8,9,{},N);_.e=function O(){return null};yd(12,11,{},Q);_.e=function R(){return null};yd(13,9,{},V);_.e=function W(){return U()};yd(14,11,{},bb);_.e=function cb(){return Z()};yd(15,3,{},fb);yd(17,1,{},ib);_.f=function jb(){return gb(0.002*((new Date).getTime()-this.b))};_.b=0;yd(23,1,oe);yd(22,23,oe);yd(21,22,oe);yd(20,21,{2:1,4:1,8:1},sb);_.g=function tb(){return this.b===qb?null:this.b};var qb;yd(29,1,{});var xb=0,yb=0,zb=-1;yd(31,29,{},Qb);var Mb;yd(34,1,{},Yb);_.h=function Zb(){var a={};var b=[];var c=arguments.callee.caller.caller;while(c){var d=this.i(c.toString());b.push(d);var e=':'+d;var f=a[e];if(f){var g,h;for(g=0,h=f.length;g<h;g++){if(f[g]===c){return b}}}(f||(a[e]=[])).push(c);c=c.caller}return b};_.i=function $b(a){return Tb(a)};_.j=function _b(a){return []};yd(36,34,{});_.h=function dc(){return Vb(this.j(Xb()),this.k())};_.j=function ec(a){return cc(this,a)};_.k=function fc(){return 2};yd(35,36,{});_.h=function mc(){return hc(this)};_.i=function nc(a){var b,c,d,e;if(a.length==0){return te}e=Zd(a);e.indexOf('at ')==0&&(e=Xd(e,3));c=e.indexOf('[');c!=-1&&(e=Zd(Yd(e,0,c))+Zd(Xd(e,e.indexOf(']',c)+1)));c=e.indexOf(se);if(c==-1){c=e.indexOf(ve);if(c==-1){d=e;e=re}else{d=Zd(Xd(e,c+1));e=Zd(Yd(e,0,c))}}else{b=e.indexOf(')',c);d=Yd(e,c+1,b);e=Zd(Yd(e,0,c))}c=Td(e,ae(46));c!=-1&&(e=Xd(e,c+1));return (e.length>0?e:te)+ue+d};_.j=function oc(a){return kc(this,a)};_.k=function pc(){return 3};yd(37,35,{},rc);yd(43,1,{},tc);var xc,yc;yd(60,1,{},Fd);_.b=0;yd(61,21,oe,Md);yd(62,21,oe,Od);yd(63,1,{4:1,7:1},Qd);_=String.prototype;_.cM={1:1,4:1,5:1,6:1};yd(64,1,{});yd(66,1,pe);yd(65,66,pe);yd(67,64,{12:1});yd(68,65,{4:1,10:1},ge);yd(69,67,{4:1,12:1},ie);var qe=Gb();var cd=Hd(ze,'Object',1),fd=Hd(ze,'String',2),rd=Gd(Ae,'String;',74),od=Gd(re,'[D',75),Qc=Hd('com.ait.toolkit.famous.kitchensink.client.','Ahome_pages_famous$1',17),Tc=Hd(Be,'Scheduler',29),Sc=Hd(Be,'JavaScriptObject$',24),pd=Gd(Ae,'Object;',73),gd=Hd(ze,'Throwable',23),ad=Hd(ze,'Exception',22),dd=Hd(ze,'RuntimeException',21),ed=Hd(ze,'StackTraceElement',63),qd=Gd(Ae,'StackTraceElement;',76),Zc=Hd('com.google.gwt.lang.','SeedUtil',49),_c=Hd(ze,'Class',60),$c=Hd(ze,'ClassCastException',61),Rc=Hd(Be,'JavaScriptException',20),Gc=Hd('com.ait.toolkit.core.client.','JsObject',3),Hc=Hd('com.ait.toolkit.famous.client.core.','EventHandler',7),Kc=Hd(Ce,'FamoUsNode',11),Nc=Hd(Ce,'RenderNode',10),Oc=Hd(Ce,'Surface',9),Lc=Hd(Ce,'ImageSurface',13),Jc=Hd(Ce,'FamoUsNode$1',12),Mc=Hd(Ce,'Modifier',14),Ic=Hd(Ce,'Context',8),bd=Hd(ze,'NullPointerException',62),kd=Hd(De,'AbstractMap',66),jd=Hd(De,'AbstractHashMap',65),md=Hd(De,'HashMap',68),hd=Hd(De,'AbstractCollection',64),ld=Hd(De,'AbstractSet',67),nd=Hd(De,'HashSet',69),Pc=Hd(Ce,'Transform',15),Yc=Hd(Ee,'StackTraceCreator$Collector',34),Xc=Hd(Ee,'StackTraceCreator$CollectorMoz',36),Wc=Hd(Ee,'StackTraceCreator$CollectorChrome',35),Vc=Hd(Ee,'StackTraceCreator$CollectorChromeNoSourceMap',37),Uc=Hd(Ee,'SchedulerImpl',31);
var $stats = function(){};
var $sessionId = function(){};
var navigator = $wnd.navigator;
$strongName = '016FA7DAC673609C725145E0C70C3035';

gwtOnLoad(null,'ahome_pages_famous',null);
})
