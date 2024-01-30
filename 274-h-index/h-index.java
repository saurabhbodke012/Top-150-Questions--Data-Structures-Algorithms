class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);
        int count = citations.length;
        int h =1;
        for(int i=1; i<=citations.length; i++){
            if( citations[count-i]< i){
                break;
            }   
            h++;
        }

        return h-1;  
    }
}