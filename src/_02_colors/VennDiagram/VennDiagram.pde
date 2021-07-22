// VennDiagram code

// Sets the size of the run window
size(600,600);

// varriables I guess
int MiddleY = 250;
int MiddleX = 300;
int dimensions = 100;
// Makes 3 diffrent elipses
fill(255, 0, 0, 100);
ellipse (MiddleX, MiddleY, dimensions, dimensions);
fill(0, 255, 0, 100);
ellipse (MiddleX-30, MiddleY-45, dimensions, dimensions);
fill(0, 0, 255, 100);
ellipse (MiddleX+30, MiddleY-45, dimensions, dimensions);
// Make em' opaque
