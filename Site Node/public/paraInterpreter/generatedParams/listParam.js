var v3;
var v2;
var v1;
var v0;
var In1;

v0 = new ArbreBin();
v1 = new ArbreBin();
v2 = new ArbreBin();
v3 = new ArbreBin(v1, v2);
v0 = new ArbreBin(v0, v3);
In1 = v0;
var ret=main(In1);
