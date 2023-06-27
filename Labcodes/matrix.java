mport java.util.*;
class Main
{
public static void main(String args[])
{
int row,col,i,j;
Scanner in = new Scanner(System.in);
System.out.println("Enter the number of rows:");
row=in.nextInt();
System.out.println("Enter the number of cols:");
col=in.nextInt();
int mat1[][]=new int[row][col];
int mat2[][]=new int[row][col];
int res[][]=new int[row][col];
System.out.println("Enter the elements of matrix1:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat1[i][j]=in.nextInt();
System.out.println();
}
System.out.println("Enter the elements of matrix2:");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
mat2[i][j]=in.nextInt();
System.out.println();
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
res[i][j]=mat1[i][j] + mat2[i][j];
System.out.println("Sum of matrices:-");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
System.out.println(res[i][j]+"\t");
System.out.println();
}
}
int a[][]={{1,3,4},{2,4,3},{3,4,5}};
int b[][]={{1,3,4},{2,4,3},{1,2,4}};
int c[][]=new int[3][3];
for(int m=0;m<3;m++){
for(int n=0;n<3;n++){
c[m][n]=a[m][n]+b[m][n];
System.out.print(c[m][n]+"");
}
System.out.println();
}
}
}
