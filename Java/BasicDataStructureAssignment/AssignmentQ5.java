// Q5. Calculate the income tax on the basis of following table. 
// Note:-Assume slab is consider for Male, Female as well as Senior citizen
//         Slab                                   Income Range                             Tax payable in Percentage
//        Slab A                               0-1,80,000                                                                  Nil
//        Slab B                               1,81,001-3,00,000                                                    10%
//        Slab C                               3,00,001-5,00,000                                                    20%
//        Slab D                               5,00,001-10,00,000                                                 30%     
// Accept CTC from user and display tax amount           
// Description:- Given 4 different types of slabs along with the percentage of tax payable in association with income ranges which are applicalble to Male,Female as well as Senior citizen.You need to specify the CTC to display the taxable amount using the above slab rates.
package Java.BasicDataStructureAssignment;
class AssignmentQ5 {
    public static void main(String[] args){
        TaxAmount taxAmount = new TaxAmount();
        System.out.println(taxAmount.calculateTaxAmount(200000));
    }
}
class TaxAmount {
    public double calculateTaxAmount(int ctc){
        double amount = 0.0;
        if(ctc>=0 && ctc<=180000){
            amount = 0.0;
        }else if(ctc>=180001 && ctc<=300000){
            amount = (ctc*(10.0/100));
        }else if(ctc>=300001 && ctc<=500000){
            amount= (ctc*(20.0/100));
        }else if(ctc>=500001 && ctc<=1000000){
            amount = (ctc*(30.0/100));
        }

        return amount;
    }
}