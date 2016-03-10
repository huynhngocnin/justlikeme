(function (lib, img, cjs, ss) {

var p; // shortcut to reference prototypes

// library properties:
lib.properties = {
	width: 300,
	height: 250,
	fps: 24,
	color: "#FFFFFF",
	manifest: [
		{src:"images/Button.png", id:"Button"},
		{src:"images/FireEmbers4copy3.png", id:"FireEmbers4copy3"},
		{src:"images/Layer13.jpg", id:"Layer13"},
		{src:"images/Layer14.png", id:"Layer14"},
		{src:"images/Layer15.png", id:"Layer15"},
		{src:"images/Layer16.png", id:"Layer16"},
		{src:"images/nv1.png", id:"nv1"},
		{src:"images/nv2.png", id:"nv2"},
		{src:"images/nv3.png", id:"nv3"},
		{src:"images/Text.png", id:"Text"}
	]
};



// symbols:



(lib.Button = function() {
	this.initialize(img.Button);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,124,61);


(lib.FireEmbers4copy3 = function() {
	this.initialize(img.FireEmbers4copy3);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,336,226);


(lib.Layer13 = function() {
	this.initialize(img.Layer13);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,336,280);


(lib.Layer14 = function() {
	this.initialize(img.Layer14);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,121,65);


(lib.Layer15 = function() {
	this.initialize(img.Layer15);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,126,30);


(lib.Layer16 = function() {
	this.initialize(img.Layer16);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,244,84);


(lib.nv1 = function() {
	this.initialize(img.nv1);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,323,212);


(lib.nv2 = function() {
	this.initialize(img.nv2);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,336,241);


(lib.nv3 = function() {
	this.initialize(img.nv3);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,158,255);


(lib.Text = function() {
	this.initialize(img.Text);
}).prototype = p = new cjs.Bitmap();
p.nominalBounds = new cjs.Rectangle(0,0,336,103);


(lib.Symbol4 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Button();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,124,61);


(lib.Symbol3 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.nv3();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,158,255);


(lib.Symbol2 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.nv1();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,323,212);


(lib.Symbol1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.nv2();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,336,241);


(lib.shape30 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AGpDTIADAAIALAeIgCACQgNgQABgQgAGfBgIADAAIAaAeIgCACQgWgWgFgKgAE2AxIhBgqIAAgBIAFAAQAYAABzBSQgZgGg2ghgAkIi1IAAgBIAGAAQASAACaB8IABADgAmVjYIgngJIADgDQAMACAngPQAWgIAEAlg");
	this.shape.setTransform(110.1,201.1);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(65.6,176.7,89,48.8);


(lib.shape29 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AGnFdQgdgogvgUIAAACIhZgxQhEghhTgIIADgDQBdAMA9AcQAgAQAuAeIAAAAQA0ATAfAnIAvBKgAhlDJQgggVgcgpQgigxgQgQQgmgihDgTIADgDQBCASAmAiQASAQAhAvQAeAqAfAVQAvAhBSARQhUgOgxgfgAnDhUQAAgQASAAQAMAAAOAaIAVAkIgCADQg/ggAAgRgAnWg+IAAgaIBAiSQAjhWAAg7QABgOgKgUIACgCQANAOAAAYQAABBgpBZQgyBugLAzg");
	this.shape.setTransform(121.8,201.5);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(74.6,159.9,94.4,83.4);


(lib.shape28 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AHHHQQAAgNAMgPQgugRgbgjQgRgWgTgwQgUg2gOgWQgSgdgagWIgNgHIAIADIgSgMIAAgIIAEAAQA9AAAtCCQAXBCAxAqIAeAWQANAJAAAEQAAAYgXAIQAAABAAABQgBAAAAABQgBAAAAAAQAAABgBAAQgBAAAAgIgACXCiIgHgHQgHgFgHAAQghARgFAAQggAAg9gkIhEgpQhfgrhcgYQgGAHgsAFQg5AHgPAJIgDAAQAAgRgHgWQgIgRAAgDIACgCIAAgBQASAKgFAfIAWABIBegKIgBAAIADgEIAGAAIABgCIAAACQA3gCB8BEQCJBNAdAAQAIAAAHgKQAHgJADAAQAPAABHATIAzAPgAmbhBIAEAAQAKAjAGANIgDABQgNgLgEgmgAmWhfQAAgugOg4QgOg8gWgjIAFgIIADAAQAVAAAbCpIgBA1IgHAGgAnhlMQAagnAGgFIAFgCQADgBAAAIQAAAKghAegAlpm+QBJgEAdgLIAVgKQAPAAACAEIgcAPQgaALgpAAg");
	this.shape.setTransform(110.5,197.3);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(62.2,150.1,96.5,94.4);


(lib.shape27 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AHmGHIgXgaIAAgCIADAAIgHgDQgZgPgaAAQgvAAgXAKQgVANgOAFIgPgCQALgHAhgNQAngPAUAAIAmAHIA7AAIgBgUIgTgGQg3gRgPAAQhtAfhEAAQhBAAhLgWQhMgagegHIADgDIBxAbQBHASA7AAQApAABBgOIBKgOQATAAA8AUIADABIADgDIADAFQAwAQAJAGQAAAegGADIgCAFIAAAAQgOgQAMgQIgqgPQAEAMAAAPQgKgCAAgDIg3gEIAtAWQALAHARASgAhSETIACgCIgZgTIABgHQgZgNgVgjIAEAAQAIAFAlAnQAEgFAKAAQAEAAANANIAAAaIgBAEgAiRChIgFg1QgTApgBAMIAAACQgGgHAAgMIAWhEIgQhuIAEAAQAGAVAKBNQAdhbAAgNQAAgPgHgVQgHgXAAgTIADgCIAAAAQAPAaACAQIgEB2IgbA7IAGBBQAAAVgFAIgAifhoIACgEQAAgJgagJIgEADQgCABAAAHQABAFgIADIgJAAQAKgEACgHQABgHADgDQgWgGgjgIQhngVgVgOIAAgHIgDgBIAGAAQBEANgmADQBmARAxAVQASgMBeAFQARgZAkhpQAahTAggOIADAHQgKAvgUAyQglBmg1AYIhiAIQAaANAIANIgBAHgAkyjWQgbgNgHgQIAEgCQAWAZA7AZIAAADgAohkFQAZgDAGgEQAPgDBeAAQADAPhxABQgeAAAAgGgACylHIgMgIIhEATIgUgBQAMgFBJgPQgegSgeAEQgPALAAgNQAAgIAEgBIAOAAQAhAAAjAXIAvgJIAAgDIAzACIABAEQgxgGgwANIASANQAmAeATgLIgIgBIADgDQAKgCAqAPIgvgJIACAJIAAAFIgMACQgUgCgrgjgAm9lbIADgEQAdAGAgAjIAAADgAoElNQAFgFAKgBIgJAMQgIAKgMAAgAD9lNIAngFQA3gNBPgnIAOAGQglAFgyAYQgvAWgtADQgEAEgBAAQgDAAAAgHgAG7l6IgBgFIAGAFIgCAHIgNAEg");
	this.shape.setTransform(107.6,196.3);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(53,157.1,109.2,78.4);


(lib.shape26 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("Ag0HlQgLgQAAgFQAAgGAIgEIAcgNQgCgOgigfIgTgSIglgeQhWhChKgTIAAgYQA7AQB/BiIAEAAQAJAAAnAkIBKBFQAAALgLAIIgYARQgLgEABgIQAAgGACgFIgEgCIACgEIAHABIAHgIIgDgFIgeARIAQAXIgCAHQgBAFgJAAQgMAAgNgUgAGzEuQgMAAgLgIQADgDAYgEIAhgFIAUADIAAAZQgdgIgcAAgACTCuIAAgBIAFAAQBEAABuAqQBoAoAAANQAAALgNALQgOggkEhUgABvDGIgfgLQgIAAgTgMQgWgOgTgGIACgDIA9AAIAdAaQAXAWAcAFQAMAIAAgNQAAgGgFgCQgFgBAAgHIACgCQANAIAAAMIAAADIgDAHQgdgCgdgMgAhKCCIgCAAIABgBIgBgBIABAAIAEgQQAAgOgOgcIgVgpIAEgBIAUAhQARAeAAAIQAAAQgFAOIgBABIAUAaQAMASADAQIAAAHQgHgGgfg9gAi1AdQAAgSACgFQAGgNAZAGIACASIgGAFQgJADgNANIAAgCQgCgBAAAIIABAFQgGgIAAgLgAmrgOQgcgfgGgEIAAgBIAFAAQAOAAAzA7IgBAAQgNAAgWgXgAiIgdQAAgZAZghIARgbIACgdIAAgDIgCgDQgHgHAAgEQAAgIABgDQADgIAIgCIAFgcQgWgMAAgJQAAgHAEgEIgugrQgFAKAAANIgDAAQgCgIABgNIABgJIgIgIIhzgqQgNAAglgrQgsgwgagWQgZAMgRACIgcAEQgHAKAAgNIA6gWIAWABQAmAEAfAyIAYAmQAMARAMAAQAOAAAuATIAmASIgFgFIAAgBIADAAQAWAAAXAMIAPgIQAigRAsAAQBQAAArg2IAagjQANgOAPADIgEANIAEgFQAggmBfgXQAHABABALIgHAGQADAFgBAKQAWgDAOAJQAPAJAJAAQAiAAAAgQICCgKQALgGAAgZIACAAIgCgBIBwgFIAHgDQABAAAAAHQAAALgyAAIhCgIIABAKQAAAQgeAOQguAVhhAAIhPgIQgRAAgEgJQgCgCAAgGIgqARQgwARAAAIIgFAFIgJgBQgUAqgpAUQghARg8AHQhFAHgQAGQgJAEgHAFIAcAUIA2A1IAAALQAEAEgMAAIgNgEIgDAoQAKAEgCAOQAAATgPAfIAAAdQgDAIgGAEIgMgEIggA0IgBACQgBAAAAgIgAD+naIAFAEIADgIIgCgCgAo2h/QgQgLgOgGIgUgKIAGgBQALAEAKAGIApAIQAtAKAMAJQg3AAgUgJgApUjGIAhh+QAZhMAogpIAHADQgdAOgbBJQgYBCAAAqQAAAVgUAag");
	this.shape.setTransform(114.3,194.8);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(52.5,144.3,123.5,101.1);


(lib.shape25 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("ACRGYQgvgrg4gBQgKABgrgvQgtgtgRgcIAEAAQBcBwAPAAQAHAAAFgGQAHgGAGgBQAZAAA9A8QA0AxATAdIgCADgAn6GPQgLgZgiABQgKAAgHgLQgFgHAAgFQAKgcAAgOIACgBIADgDQAEgCAAAJQAAAJgOAcQAAAOARAAQAmAAALAbQAKAaAMAAQAcAABwgmQAmABgBAhIAAACIgHgQQgKgMgPAAQgKAAg3ATQg5ASgLAAQgaAAgMgZgAExFNQhGgSgZgcIAMgRQhjg3hdglIACgEQAyAPBJAjQBLAjAAALQAAAHgEADIgIAFIAfAWQAXALBGAAIgHgLQAMgDARAOIAeAYIgBAEIgIACQgaAAg2gPgAhPCAQgGAAgFAEIAPgDIAbAEQgSAJghAJIglAJQgWAAgNgwQgFgUgCgSIgGgKIgKADQgDAFAAgMQAAgrAFgRIACgHIgIgKQAAgQARAAIADAAQAGgLAJgJIAAgPIAEAAIABAJIADgDIgLgNIgCAAIABgBQgLgMAAgGQAAgTASgBIACAAIAAhFIgCACIgIgBQgDgBAAgIQAAgFAFgHIgshHQhFhsg5gBIiHAKIhDANQAbgdA8gFQAlgCBUADQAhgBBRBQIAjAlIADAAQAIAAAIANQAKANATAAQANAAAHgKQAzhVA0gfIg3BTQgYAkgZAUIgQAbIAAABIAHgBIAEAdIAEAGIgDAFIAAAFQAAASgNAfIgMAWIgDAUIADAHIgDADIgBgFIgBAGQAAAGgLAYIAAAAIgFAKIABAIIgEALQgFAFAAAEIgBA1IAKAwQAIAwAMAAQAPAAASgLIAHgFQgMgPAAgQIACgIIAIgBIBLAMQBMARAVAbIgCAIQhQghhAAAgAi5APIAAAIIAFgTgAiai5IgBArQAAAPABAOIAEABQAOghgCgNIAAgMIgQgQgAisjvIAIALQADAHAEACIABgGQAAgHgGgIgAmOBTQAAgfgPgTIgHgIIgXgOQAAgHADgEIgpgWQgwgZgxgSIACgEQAmAKA5AgIAsAbQAEgEAHAAQAcAAgNAbIADAFIgCAFIAHAMQAKAPAAAMIgBALgAqhhJQAZgYAAgMIgoh9QAAgHgFACQgFACAAgGQAAgNBGgkQBGgjAhgFQgiALiDBJIgDADIARgEIAFgCQADgCAAAIIgPAPIAoB2QAAAMgOATIgGAFIAFgEIABgBIALgJQAKgJAaABQAjAAAbANQgagIgNAAQgMAAgVAIQgWAHgJAJQgTgBgDgDgAgel9QABgFAmgHQAtgHApAFICRAAQArAGAzggQAwgfgHgNQAAgJARAAICxAHIABADIiAgDQgcgBgdARIgtAgQg3ArgygRIiUAAIhuAQQgDAEgBAAQgDAAAAgIgAI6nbIAAgGQAAgCAIAAQASgBAuAWQAuAUALANIAAAEg");
	this.shape.setTransform(118.9,194.3);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(48.9,145.8,139.9,97);


(lib.shape24 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AEYHkQhAgcgIgHIh7hNQgNATgEAwQgDArgZAWIgBgJQAAgKATg8QAUg/AIAAQAdAAAzAmIA2AuQADACA8AVQAvAQAOAhQAUgoABhHIgFhxIAFgBQAJAWABCAQAABJgoANQgJgZgugUgACmDhIgbg8QgQgcgRAAQgPAKgYAKQgxAThVAAIgWgDIgFgHIAKACQCEgOANgHIApgWQAgAAAwBbQAJAPAfAbIA5AxQAFAGgNAAQg/AAgqhYgAojDNQgKgpAAgUIABgEIAFgCQAKAPgHAtQAGAmBHAAQBEAAAngUQASAAANAfQgegRgDAAQgaASgUgBQhTgEgTADQgHACAAAHIgDAIQgMgKgLgwgAkfBTQAAgJhhhMQhwhbgXgYQAXgkA6hrQAzhdAegpQAIADAAAJQAAAKAYANQAcAQAIANIgBAGIg+gvQgWAeg5BhQhCBvAAATQAAAFBZBNQBlBXAbAcIgBAEQgDAEgBAAQgCAAAAgIgAiihzQAAgmAthDQA2hRAJgaIADAAIAFABIACAIIg1BVQg0BYAAAcQAAAFAfAfQApAnAUAaIgFAGQhkhYAAgRgAHQgfQAMgaAWgFIAwgNIAMABQgHAOgmAJQgmAJgGALgAj0lHQARgcAkghQAwgtAfAAIBaAMIChANQAhAAAhgtQAOgUAbg1IAGgCIACAGQAAAQgpAzQgsA5gcAAIh9gJQgNgJhwAAQgjAAguAoIgxAxgAFYmsQgbgqgXgRIACgEQAgAVAYAjQAkAxAPAQIgCADQgggUgZgpg");
	this.shape.setTransform(109.7,191.2);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(53.9,138.2,111.7,106);


(lib.shape23 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AhvHJIC0hpQCEBUATAAIAFABIgDgHQABgFAhgOQAogSAcAHQgJgTgdilQgYiIgXABQhDAAgngPIgfgSIAPgCQAFAAAYAKQAkAJA+AAQAoAAAIA0QAAAGgGABQgEABAAAGQgBAcAoBwQACAoAMAqQALAoAAASQAAAMgDgFQhdADgFAPIAAAKQgBAEgQAAQgeAAgggSIhUgwQgNgJAGgPQgTAHg/AmIhcA1gApSAMQgWgOgMgSQgJgNABgEQAAgZAMgMQAFA5AFANQARACAPAGIAeAQQA0AWCDAJIAHAFIAAACIgZADQiJgBhGgwgAHwACIgNgUQgHgKgOAAQgJAAgSAMQgUAPgJAQIgGgCQgCAGABgNQAAgHAZgVQAagVANAAQAPAAAFAKIAKAWQAYAdBxABQAIAAgBACIgBAFIhBAIQg4AAgTgggAgrgaQg6gTgrAAQgMAKAAgNQAAgHADgBIAOABQAkAAAwAPQA0ASAZAWIgCABQgKgJg1gSgAmNhVQAYgiAAgFIgOgaQAAgSA8gcQA8gbAqAAQArAAAQgPQAKgIATgDQgKADgJAHIgLAPQgKAIgmAAIg5AEQgtAPgfAVQgdATAAAMQAAAGAFAEQAGAEAAAGQAAAKgNARIgPAQgAmZjuQAGgJAdgDQgGgSglgYQgmgYgEgSIAFgEQAdALAcAdQAbAaALAZIgxANgAGgjyQAAgSAFgIIAAhAIgZgCIgKgDIA6gTIB+ABIAAAFIiTAHQADALAAAeQAAAlgFAXgAhkj8IAKgBQAyAAANgQIgQgHQAQgiA5hCQA1g6AAgGQgBgNgIgDIAHgBQANAADbB8QAFADgNAAQicgvg0g3QgUASgrA2QgoA0geAaIAOAPQAAASgPAAg");
	this.shape.setTransform(112.6,202.9);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(48.8,157,127.6,91.7);


(lib.shape21 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AgxHsQAJhFgDgsIADAAIAHAqQAAAcgMArgAAWD/QAAgOAphCQAthIAYAAQAIABAFAFIAJAHQgbgugGgTQgCgJAAgpQgKgiAAgMQABgxBSAAQAlABBRAQQBRARA7ABQA5gBAKgvQADgPgBgWIgCgXQAHhGAAgtIAJgCQAFASAAAcQAAAXgQBTQgRBXgKAPQgMgFgEgHIkDgkIgUgBQgLgBABAJQAAAKgkgNQgKAAgKAPQgKANABAEQAAAXAEAqQAAAXAtBdQgCAIgLAAQgKAAgGgIIgKgOQgYAlhUBpQgFgFAAgHgAkwDiQhdgkgaghQgSgUAAgvQANAtAZAbQAuAyBlAAQAPAAAEgNQAEgLAWAHIAGheQAAg7gQgWQADgGAKgFQAMBXAAAxIAAA0QgIAigvABgAnegXQgeg0gdghIAIgBQAuAAAPAyQAHAaAIA+QgJgYgQgcgAn2icQAAgTAsgLQA1gMASgaQAZgjgDghQBcgEBJgkQAQgJA5gnIAGAIQgtAogmAPIhOAQQg4ALgLASIgdA8QgLAQgrATIgwASIAJAeQgCAHgIABQgVgaAAgJgAgckKQAHgXAAgMIAHAAQADAHgFAVQAAAGAFAAQAIAAADALIAAACIgNACQgPAAAAgOgAFomCIhQhBIgBgCQhkgdg9AAQgLAAgSAPQgUAPgPAAIgFgEQAGgHAagPQAXgNADAAQAhAACKAhQAEgGAFAAQAmAAA5AyQBAA2AXAGIAJAMQACAFgMAAQgxAAg7gxgAhFmlQAFgTABgSIACAAIACAOQAAAKgEANg");
	this.shape.setTransform(115.6,199.2);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(61.7,149.9,107.7,98.5);


(lib.shape19 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("Ag0FBQgygXgKAAQgdAAgbAPQgcAQgdAAQgyAAg6hEQgyg5AAgQQAAgbAWgUIBEg6QAegcAbhHQAOglAOg/QAQhIAAgmQAAgKBXgqQBSgnAUgEIADAJIhiAxQhHAkAAAXQgDA8gWBCQgMAjgTBaIhAA6IhFBCQAaAMgDAIIgJASQAAAQAqApQAtArAgAAQAaAAARgLQARgLASAAQBHAABQA4IgBABQgJAAgugXgAEXEEQBciqAAgmQAAgrgmiCIAIgCIAZBmQASBMAAAKQAAAGgEAAQgEgBAAAGQgIAVAAALQAAAihKB8IgMgCIgCADQgBAAAAgHgACUkKQAAgGAEAAQADAAAAgFQAAgIAhg6IAFAAQgTA9gYAWg");
	this.shape.setTransform(109,204.3);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(70.6,169.9,76.9,68.8);


(lib.shape17 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AErDoIAHgDQADgBAAgPQABgPgZg5QgZg5AAgRIAHAAQAxBmAEA/gADWAqQghgRhbgNIAFgHQBVAGAkAPQAgANAMAcIgGAFQgUgUgUgKgAjMg7QgzgPhAgsQAKgOAfgHQgBgKgPgkQgOgiAAgMIAHAAQAgAYAAA+IgCAPQgFAFgeAHQAiAcBGATQBTAWDHAcIAAAHQjLgVhRgYg");
	this.shape.setTransform(112.5,198);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(80.5,174.8,64,46.5);


(lib.shape22 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("AiFJcQAKg0AOg0QAahpAVAAQBNABBAA1IAnAkQARARAHAAIA7hAQAFgHAegVQAagXgNgMIALgGIAKACIABAIIh5CQQgTAAgfgeIgmglQgOgKgxgPQgzgPgKgGQgUAjgRBDIgcBnQgGgEAAgHgABsCHIgFgKQAVAcAnAjIBzBpIgCACQiIh6gggmgAnsCGQhSgxgBgHIAKgTIACgLIAIAAQANAXAAAHQAAAHgDAAIgKABQAdAVCZA7QA0AABEgsIBUg0IgBAAQgFgBgFgDQgFgFgMgBQAIgHAsgJQAugJAZgOIAogdQAhgZALAAQATAAA8BjQAAAGgFgCQgBAAgBAAQAAAAgBAAQAAAAgBABQAAAAAAABIgKgXQgehDgbAAQhfA9g1ATIhnA/Ig6AjIALADQgLAGgOAAIgFAAQgmASgSAAQgiAAhXg1gAFWBIQgRgQgGgMIAFgHIA5AqQA6AABCg1IBGg7QglApgiAdQhCA6g3AAQgSAAgXgXgAlugwQACgGAAANQAAALgPAzIgFAAQAFgzANgSgAl2h0IAAgeQAFgMAAgZIADAAIACARIgGAygAl7jiQAGgVgCg8QAAg2ALgbIAEAAQAEgIAAANQAABcgSBCgAEekSIgIgqIAGgBIBiAKIhYACIAGAPIAAAxQgEAAAAAEQgHgNgDgYgAg+j6QCAi7gBgIIABgEIAFAAQAQABA4BGQA5BIAQApIAAACQg7hbhEhDQgwAfghA7QgiA+ghAYIgCADQAAAAgBgIgAITm/IADgCIAGABIABAIQABAygzAoIgbATQArgjAYhRgAibplQgsAfhLAkQBPgyAogRg");
	this.shape.setTransform(119.3,195.1);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(61.7,133.6,115.2,123);


(lib.shape20 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("ACkHoIAWgTIALgQQAPgUBFgYQAvgPAxgdQA1gfAGgSQAohwAIhJQgNgLgOgTQgYgggKgIIAEgDQAZARAvA/IgCACIgIgEIACAVQAAAegwCXQgDAOgzAbQgwAZg1ARQg2ASgUAQQgOAMgMAcQgRgBgHgGgAhkHOQgjgZgbAAQgxAAg1AZQg2AZgRAAQgmAAgegYQgWgSAAgKIACgGQACgCAFAAIBLAtIBBgXQBCgXAMAAQAxAAAvAbQAjAUAMASIgBAEgAAuESQAAgRgUhpIgIgqQAAgFAIgNQAJgOAVgYIAlgrQAIgIAAAMIgjApQgiAnAAAHQAAAQAMBLQANBNAAAeIgBAhIgFACgAnyFHQAAgJAZgZQAYgXAGAAIABgDIABAIQAAAHgQAUQgUAYgVAJgAljCbQAdgdAAgYQAAgGgGgKQgGgKAAgHIA9i1QAThBA6gIIAZgBQAYgNCcgYQiTAZggAMIBWgEQA+gKA3gbIAAAAIgRADIAVgFIBJgoIABgDIABAIIgCANQA6gZAAggQAAgGAFgCQAFgCAAgHQAAjCjwAwIBCgWQBogBArAtQAnAoAABfQAAAlhRAdQgRAihYAQIhkAPQg9AJgjAMQgzARgOAfQgIARgEAqIg5DYQgKgCAAgLQgOADgSAXQgRAXgWAFgACchAQATgnAYgKQARgHAAgQQAAgUgPgCIAIgTIADAAIgBAJIAKAjQAAAegOAIQgeAOgQATg");
	this.shape.setTransform(111.8,192.8);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(61.9,143.3,100,99);


(lib.shape18 = function() {
	this.initialize();

	// Layer 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#FFFFFF").s().p("ADgEnQgkg3g5gbIgZABQhMgWhiAAIgJACIhBAAQgegDgDgHIABgBQhlgcAAhcQAAgTADgRQgSgqgZgMIBoi7QA/hyA1g4IACgEIABAPIi0E7IAQAeQAJgVAMgKQAJAbgGAkIgBANQAXAxAAAGQAAANgLAMIAAABQANAUARASQAVAUAWANIDbAGQAaAFAkAYIADAHQBJAwBrB6IgDAIQgsgYgthGg");
	this.shape.setTransform(116.8,189.1);

	this.addChild(this.shape);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(85.2,150.1,63.3,77.9);


(lib.Text_1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Text();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,336,103);


(lib.Layer15_1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Layer15();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,126,30);


(lib.Layer14_1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Layer14();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,121,65);


(lib.Layer13_1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Layer13();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,336,280);


(lib.FireEmbers4copy3_1 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.FireEmbers4copy3();

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,336,226);


(lib.sprite31 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.shape17("synched",0);

	this.instance_1 = new lib.shape18("synched",0);

	this.instance_2 = new lib.shape19("synched",0);

	this.instance_3 = new lib.shape20("synched",0);

	this.instance_4 = new lib.shape21("synched",0);

	this.instance_5 = new lib.shape22("synched",0);

	this.instance_6 = new lib.shape23("synched",0);

	this.instance_7 = new lib.shape24("synched",0);

	this.instance_8 = new lib.shape25("synched",0);

	this.instance_9 = new lib.shape26("synched",0);

	this.instance_10 = new lib.shape27("synched",0);

	this.instance_11 = new lib.shape28("synched",0);

	this.instance_12 = new lib.shape29("synched",0);

	this.instance_13 = new lib.shape30("synched",0);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.instance}]}).to({state:[]},1).to({state:[{t:this.instance_1}]},1).to({state:[]},1).to({state:[{t:this.instance_2}]},1).to({state:[]},1).to({state:[{t:this.instance_3}]},1).to({state:[]},1).to({state:[{t:this.instance_4}]},1).to({state:[]},1).to({state:[{t:this.instance_5}]},1).to({state:[]},1).to({state:[{t:this.instance_6}]},1).to({state:[]},1).to({state:[{t:this.instance_7}]},1).to({state:[]},1).to({state:[{t:this.instance_8}]},1).to({state:[]},1).to({state:[{t:this.instance_9}]},1).to({state:[]},1).to({state:[{t:this.instance_10}]},1).to({state:[]},1).to({state:[{t:this.instance_11}]},1).to({state:[]},1).to({state:[{t:this.instance_12}]},1).to({state:[]},1).to({state:[{t:this.instance_13}]},1).to({state:[]},1).wait(10));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(80.5,174.8,64,46.5);


(lib.nv3_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol3();
	this.instance.setTransform(79,127.5,1,1,0,0,0,79,127.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({y:127.7},0).wait(1).to({y:127.8},0).wait(1).to({y:128},0).wait(1).to({y:128.1},0).wait(1).to({y:128.3},0).wait(1).to({y:128.4},0).wait(1).to({y:128.6},0).wait(1).to({y:128.8},0).wait(1).to({y:128.9},0).wait(1).to({y:129.1},0).wait(1).to({y:129.2},0).wait(1).to({y:129.4},0).wait(1).to({y:129.6},0).wait(1).to({y:129.7},0).wait(1).to({y:129.9},0).wait(1).to({y:130},0).wait(1).to({y:130.2},0).wait(1).to({y:130.3},0).wait(1).to({y:130.5},0).wait(1).to({y:130.4},0).wait(1).to({y:130.2},0).wait(1).to({y:130.1},0).wait(1).to({y:129.9},0).wait(1).to({y:129.8},0).wait(1).to({y:129.6},0).wait(1).to({y:129.5},0).wait(1).to({y:129.3},0).wait(1).to({y:129.2},0).wait(1).to({y:129},0).wait(1).to({y:128.9},0).wait(1).to({y:128.7},0).wait(1).to({y:128.6},0).wait(1).to({y:128.4},0).wait(1).to({y:128.3},0).wait(1).to({y:128.1},0).wait(1).to({y:128},0).wait(1).to({y:127.8},0).wait(1).to({y:127.7},0).wait(1).to({y:127.5},0).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,158,255);


(lib.nv2_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol1();
	this.instance.setTransform(168,120.5,1,1,0,0,0,168,120.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({y:120.6},0).wait(1).to({y:120.7},0).wait(1).to({y:120.8},0).wait(1).to({y:120.9},0).wait(1).to({y:121},0).wait(1).to({y:121.1},0).wait(1).to({y:121.2},0).wait(1).to({y:121.3},0).wait(1).to({y:121.4},0).wait(1).to({y:121.6},0).wait(1).to({y:121.7},0).wait(1).to({y:121.8},0).wait(1).to({y:121.9},0).wait(1).to({y:122},0).wait(1).to({y:122.1},0).wait(1).to({y:122.2},0).wait(1).to({y:122.3},0).wait(1).to({y:122.4},0).wait(1).to({y:122.5},0).wait(1).to({y:122.4},0).wait(1).to({y:122.3},0).wait(1).to({y:122.2},0).wait(1).to({y:122.1},0).wait(1).to({y:122},0).wait(1).to({y:121.9},0).wait(1).to({y:121.8},0).wait(1).to({y:121.7},0).wait(1).to({y:121.6},0).wait(1).to({y:121.5},0).wait(1).to({y:121.4},0).wait(1).to({y:121.3},0).wait(1).to({y:121.2},0).wait(1).to({y:121.1},0).wait(1).to({y:121},0).wait(1).to({y:120.9},0).wait(1).to({y:120.8},0).wait(1).to({y:120.7},0).wait(1).to({y:120.6},0).wait(1).to({y:120.5},0).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,336,241);


(lib.nv1_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol2();
	this.instance.setTransform(161.5,106,1,1,0,0,0,161.5,106);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({y:106.1},0).wait(2).to({y:106.2},0).wait(2).to({y:106.3},0).wait(2).to({y:106.4},0).wait(2).to({y:106.5},0).wait(2).to({y:106.6},0).wait(2).to({y:106.7},0).wait(2).to({y:106.8},0).wait(2).to({y:106.9},0).wait(2).to({y:107},0).wait(2).to({y:106.9},0).wait(2).to({y:106.8},0).wait(2).to({y:106.7},0).wait(2).to({y:106.6},0).wait(2).to({y:106.5},0).wait(2).to({y:106.4},0).wait(2).to({y:106.3},0).wait(2).to({y:106.2},0).wait(2).to({y:106.1},0).wait(2).to({y:106},0).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,323,212);


(lib.Layer16_1 = function() {
	this.initialize();

	// Layer 2
	this.instance = new lib.sprite31();
	this.instance.setTransform(133.4,40,1.65,0.455,0,0,0,122.8,195.1);
	this.instance.shadow = new cjs.Shadow("rgba(255,153,0,1)",0,0,5);

	// Layer 1
	this.instance_1 = new lib.Layer16();

	this.addChild(this.instance_1,this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(0,0,244,84);


(lib.Button_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 1
	this.instance = new lib.Symbol4();
	this.instance.setTransform(62,30.5,1,1,0,0,0,62,30.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({y:29.5},0).wait(1).to({y:28.5},0).wait(1).to({y:29.5},0).wait(1).to({y:30.5},0).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,124,61);


(lib.Group1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Layer 14
	this.instance = new lib.Layer14_1();
	this.instance.setTransform(60.5,34.5,1,1,0,0,0,60.5,32.5);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(150));

	// Button
	this.instance_1 = new lib.Button_1();
	this.instance_1.setTransform(167,247.5,1,1,0,0,0,62,30.5);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(1).to({regY:29.5,y:246.5},0).wait(149));

	// Layer 15
	this.instance_2 = new lib.Layer15_1();
	this.instance_2.setTransform(168,140,0.156,0.156,0,0,0,65,-1.9);
	this.instance_2._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(17).to({_off:false},0).wait(1).to({regX:63,regY:15,scaleX:0.36,scaleY:0.36,x:167.3,y:146.1},0).wait(1).to({scaleX:0.57,scaleY:0.57,x:166.9,y:149.6},0).wait(1).to({scaleX:0.77,scaleY:0.77,x:166.5,y:153},0).wait(1).to({scaleX:0.98,scaleY:0.98,x:166.1,y:156.5},0).wait(1).to({scaleX:1.18,scaleY:1.18,x:165.7,y:159.9},0).wait(1).to({scaleX:1.09,scaleY:1.09,x:165.9,y:158.4},0).wait(1).to({scaleX:1,scaleY:1,x:166,y:156.9},0).wait(126));

	// Layer 16
	this.instance_3 = new lib.Layer16_1();
	this.instance_3.setTransform(163,198,3.59,3.59,0,0,0,122,42);
	this.instance_3._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_3).wait(25).to({_off:false},0).wait(1).to({regX:123.6,scaleX:2.93,scaleY:2.93,x:167.8},0).wait(1).to({scaleX:2.26,scaleY:2.26,x:166.7},0).wait(1).to({scaleX:1.6,scaleY:1.6,x:165.6},0).wait(1).to({scaleX:0.93,scaleY:0.93,x:164.5},0).wait(1).to({scaleX:0.97,scaleY:0.97,x:164.6},0).wait(1).to({scaleX:1,scaleY:1},0).wait(119));

	// Text
	this.instance_4 = new lib.Text_1();
	this.instance_4.setTransform(168,184.5,1,1,0,0,0,168,51.5);
	this.instance_4._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_4).wait(22).to({_off:false},0).wait(128));

	// Fire-Embers-4 copy 3
	this.instance_5 = new lib.FireEmbers4copy3_1();
	this.instance_5.setTransform(168,167,1,1,0,0,0,168,113);
	this.instance_5.compositeOperation = "lighter";

	this.timeline.addTween(cjs.Tween.get(this.instance_5).wait(150));

	// nv3
	this.instance_6 = new lib.nv3_1();
	this.instance_6.setTransform(453,152.5,1,1,0,0,0,79,127.5);
	this.instance_6._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_6).wait(2).to({_off:false},0).wait(1).to({regY:129,x:413.2,y:154},0).wait(1).to({x:373.4},0).wait(1).to({x:333.6},0).wait(1).to({x:293.8},0).wait(1).to({x:254},0).wait(1).to({x:255.5},0).wait(1).to({x:257},0).wait(141));

	// nv1
	this.instance_7 = new lib.nv1_1();
	this.instance_7.setTransform(-157.5,174,1,1,0,0,0,161.5,106);
	this.instance_7._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_7).wait(1).to({_off:false},0).wait(1).to({regY:106.5,x:-76.5,y:174.5},0).wait(1).to({x:4.5},0).wait(1).to({x:85.5},0).wait(1).to({x:166.5},0).wait(1).to({x:164},0).wait(1).to({x:161.5},0).wait(143));

	// nv2
	this.instance_8 = new lib.nv2_1();
	this.instance_8.setTransform(168,120.5,1,1,0,0,0,168,120.5);
	this.instance_8.alpha = 0;
	this.instance_8._off = true;

	this.timeline.addTween(cjs.Tween.get(this.instance_8).wait(9).to({_off:false},0).wait(1).to({regY:121.5,y:121.5,alpha:0.143},0).wait(1).to({alpha:0.286},0).wait(1).to({alpha:0.429},0).wait(1).to({alpha:0.571},0).wait(1).to({alpha:0.714},0).wait(1).to({alpha:0.857},0).wait(1).to({alpha:1},0).wait(134));

	// Layer 13
	this.instance_9 = new lib.Layer13_1();
	this.instance_9.setTransform(168,140,1,1,0,0,0,168,140);

	this.timeline.addTween(cjs.Tween.get(this.instance_9).wait(150));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,336,280);


// stage content:
(lib._300x250 = function() {
	this.initialize();

	// Layer 1
	this.instance = new lib.Group1();
	this.instance.setTransform(150,125,0.893,0.893,0,0,0,168,140);

	this.addChild(this.instance);
}).prototype = p = new cjs.Container();
p.nominalBounds = new cjs.Rectangle(150,125,300,250);

})(lib = lib||{}, images = images||{}, createjs = createjs||{}, ss = ss||{});
var lib, images, createjs, ss;