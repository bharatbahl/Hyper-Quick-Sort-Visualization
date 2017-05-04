
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author adityangt
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import static javaapplication2.MyModel.myArray;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class main2 {
	static JFrame f;
	static String t=firstpage.t.getText();
	  static String a[]=t.split(",");
  public static void main(String[] args) {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel1 myArrayClass = new MyModel1();

    MyView1 panel = new MyView1(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 2");
  }

   static void performSorting( MyModel1 myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView1 extends JPanel {
  MyModel1 myModel;
  public MyView1(MyModel1 myArrayClass) {
    this.myModel = myArrayClass;
  }
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.BLACK);
    int size = myModel.arraySize;
    int barWidth = getWidth() / size;
    for (int i = 0; i < size; i++) {
      int value = myModel.myArray[i];
      int x = i * barWidth;
      int y = getHeight() - value;
      g.drawString(value+"",x+barWidth/2,y);
      g.fillRect(x + 1, y, barWidth - 2, value);
    }
  }
}
class SendArray2{
    static String t=firstpage.t.getText();
    static String a[]=t.split(",");
    static int size = a.length;
    static int arr2[]= new int[size/4];
    public void add(int i, int n){
        arr2[i] = n;
    }   
}

class MyModel1 {
  static int myArray[];
  int arraySize;
  int res;
  static String t=firstpage.t.getText();
  static String a[]=t.split(",");
  int size = a.length;
  MyView1 myView;
  public MyModel1() {
    arraySize = (int)(size/4);
    myArray = new int[arraySize];
    for (int i = arraySize; i < 2*arraySize; i++) {
      myArray[i-arraySize] = Integer.parseInt(a[i]);
    }
  }
SendArray2 obj1 = new SendArray2();
  public void QuickSort(int Left, int Right) {
    if (Right - Left <= 0) {
      return;
    } else {
      int Pivot = myArray[Right];
      Partitioning(Left, Right, Pivot);
      int PivotValue = res;
      QuickSort(Left, PivotValue - 1);
      QuickSort(PivotValue + 1, Right);
    }
        for(int i=0;i<myArray.length;i++){
        obj1.add(i, myArray[i]);
    }
  }

  public void Partitioning(int Left, int Right, int Pivot) {
    int LeftP = Left - 1;
    int RightP = Right;
    while (true) {
      while (LeftP < Right && myArray[++LeftP] < Pivot) {
      }
      while (RightP > 0 && myArray[--RightP] > Pivot) {
      }
      if (RightP <= LeftP) {
        SwapValues(LeftP, Right);
        res = LeftP;
        break;
      } else {
        SwapValues(LeftP, RightP);
        break;
      }
    }
  }

  private void SwapValues(int LeftP, int RightP) {
    int aux = myArray[LeftP];
    myArray[LeftP] = myArray[RightP];
    myArray[RightP] = aux;

    try {
      Thread.sleep(150);
    } catch (Exception e) {
      Thread.currentThread().interrupt();
    }
    myView.repaint();
  }
}


