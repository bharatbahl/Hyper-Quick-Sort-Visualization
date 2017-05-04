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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javaapplication2.MyModel1.myArray;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class merge1 {
    static JFrame f;
  public static void main(String[] args) {
    
    f = new JFrame();
    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    MyModel5 myArrayClass = new MyModel5();

    MyView5 panel = new MyView5(myArrayClass);
    myArrayClass.myView = panel;
    JButton sortButton = new JButton("Sort");
    JButton nextButton=new JButton("Next");
    
    sortButton.addActionListener(e -> performSorting(myArrayClass));
    f.getContentPane().add(sortButton, BorderLayout.NORTH);
    f.getContentPane().add(nextButton, BorderLayout.EAST);
    nextButton.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new swaparray21().main(null);
                        new merge21().main(null);
                        new merge22().main(null);
                        new merge23().main(null);
                        new merge24().main(null);
                        f.dispose();
                        merge2.f.dispose();
                        merge3.f.dispose();
                        merge4.f.dispose();
			}
		});
    f.getContentPane().add(panel, BorderLayout.CENTER);
    f.setSize(400, 400);
    f.setVisible(true);
    f.setTitle("part 1");
  }

   static void performSorting( MyModel5 myArrayClass) {
    Thread thread = new Thread(()-> {
        myArrayClass.QuickSort(0, myArrayClass.arraySize - 1);
        
        System.out.println("Done");
    });
    thread.start();
  }
}
class MyView5 extends JPanel {
  MyModel5 myModel;
  public MyView5(MyModel5 myArrayClass) {
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

class SendArray5{
    static swaparray obj1 = new swaparray();
    static int size = obj1.pp0.length;
    static int arr5[]= new int[size];
    public void add(int i, int n){
        arr5[i] = n;
    } 
}

class MyModel5 {
  static int myArray[];
  int arraySize;
  int res;
  swaparray obj1 = new swaparray();
  int a[] = obj1.pp0;
  
  int size = a.length;
  MyView5 myView;
  public MyModel5() {
    arraySize = size;
    myArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      myArray[i] = a[i];
    }
  }
SendArray5 obj2 = new SendArray5();
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


