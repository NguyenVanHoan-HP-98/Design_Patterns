package org.example.Clinets;

import org.example.Adapter.JapanseAdapter;
import org.example.Adeptee.JapanseAdaptee;
import org.example.Target.ITarget;

public class Client {
    public void Send(String tiengvietcansend)
    {
       // JapanseAdaptee japanseAdaptee = new JapanseAdaptee();
       // japanseAdaptee.Recive(tiengvietcansend);
        // Lỗi Recive của JapanseAdaptee, chỉ nhận đầu vào là 1 String tiếng nhật
        ITarget iTarget = new JapanseAdapter(new JapanseAdaptee());
        iTarget.Send(tiengvietcansend);

    }
}
