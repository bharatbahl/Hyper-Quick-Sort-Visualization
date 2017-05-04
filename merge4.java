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
import static javaapplication2.MyModel1.myArray;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class merge4 {
    static JFrame f;
  public static void main(String[] args) {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel8 myArrayClass = new MyModel8();

    MyView8 panel = new MyView8(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 4");
  }

   static void performSorting( MyModel8 myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView8 extends JPanel {
  MyModel8 myModel;
  public MyView8(MyModel8 myArrayClass) {
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

class SendArray8{
    static swaparray obj1 = new swaparray();
    static int size = obj1.pp3.length;
    static int arr8[]= new int[size];
    public void add(int i, int n){
        arr8[i] = n;
    } 
}

class MyModel8 {
  static int myArray[];
  int arraySize;
  int res;
  swaparray obj1 = new swaparray();
  int a[] = obj1.pp3;
  
  int size = a.length;
  MyView8 myView;
  public MyModel8() {
    arraySize = size;
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = a[i];
    }
  }
SendArray8 obj2 = new SendArray8();
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
    for(int i=0;i<myArray.length;i++)
        obj2.add(i, myArray[i]);
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


