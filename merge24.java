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

public class merge24 {
    static JFrame f;
  public static void main(String[] args) {
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel12 myArrayClass = new MyModel12();

    MyView12 panel = new MyView12(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    JButton nextButton=new JButton("Next");
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 4");
  }

   static void performSorting( MyModel12 myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView12 extends JPanel {
  MyModel12 myModel;
  public MyView12(MyModel12 myArrayClass) {
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

class SendArray12{
    static swaparray21 obj1 = new swaparray21();
    static int size = obj1.pp3.length;
    static int arr12[]= new int[size];
    public void add(int i, int n){
        arr12[i] = n;
    } 
}

class MyModel12 {
  static int myArray[];
  int arraySize;
  int res;
  swaparray21 obj1 = new swaparray21();
  int a[] = obj1.pp3;
  
  int size = a.length;
  MyView12 myView;
  public MyModel12() {
    arraySize = size;
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = a[i];
    }
  }
SendArray12 obj2 = new SendArray12();
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


