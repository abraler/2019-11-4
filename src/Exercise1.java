/*
给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。

每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。

这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。

返回一个符合上述规则的链表的列表。
 */
public class Exercise1 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }
    class Solution {
        public ListNode[] splitListToParts(ListNode root, int k) {
            int num=0;
            ListNode cur=root;

            while(cur!=null){
                cur=cur.next;
                num++;
            }
            int groop=num/k;//每组多少个
            int mod=num%k;//分完后还有多少个

            ListNode []a=new ListNode[k];
            cur=root;
            for (int i = 0; i <k ; i++) {
                ListNode p=new ListNode(0);
                ListNode pro=p;

                for (int j = 0; j<groop+(i<mod?1:0) ; j++) {
                    pro.next=new ListNode(cur.val);
                    pro=pro.next;
                    if(cur!=null)
                        cur=cur.next;

                }

                a[i]=p.next;
            }
            return a;
        }
    }
}
