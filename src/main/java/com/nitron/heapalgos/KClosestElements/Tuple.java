package com.nitron.heapalgos.KClosestElements;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tuple {

    private int value;
    private int diff;

   /* @Override
    public int compareTo(Tuple t) {
        if(this.diff>t.diff)
            return 1;
        else if(this.diff<t.diff)
            return -1;
        return 0;
    }*/
}
