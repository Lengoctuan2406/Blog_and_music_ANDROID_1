package com.example.bookinghotel.fragment_main;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.bookinghotel.adapter.AdapterBlog;
import com.example.bookinghotel.R;
import com.example.bookinghotel.database.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogFragment extends Fragment {
    RecyclerView recyclerView_listBlog;
    LinearLayout linearLayout_adapter_list_blog;
    CardView adapterLayout_list_blog;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView_listBlog = (RecyclerView) view.findViewById(R.id.rvc_list_blog);
        RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        recyclerView_listBlog.setLayoutManager(gridLayoutManager);

        AdapterBlog adapter_list_blog = new AdapterBlog(getListBlog());
        recyclerView_listBlog.setAdapter(adapter_list_blog);
    }

    private List<blog> getListBlog() {
        List<blog> blog_models = new ArrayList<>();
        blog_models.add(new blog(R.drawable.blog1, "Nadine Phu Quoc Resort", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog2, "Night Sea Hotel", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog3, "Paralia Hotel", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog4, "The Hill Resort", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog1, "Nadine Phu Quoc Resort", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog2, "Night Sea Hotel", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog3, "Paralia Hotel", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        blog_models.add(new blog(R.drawable.blog4, "The Hill Resort", "Address","Night Sea Hotel cái tên đứng đầu trong danh sách những khách sạn có chỗ đậu xe hơi ở Phú Quốc mà Go2Joy muốn bật mí đến bạn đọc. Với không gian sang trọng, hiện đại Night Sea Hotel đã khiến cho không ít du khách phải say mê khi lần đầu đến đây nghỉ dưỡng.Toàn bộ phòng khách sạn của Night Sea Hotel được thiết kế theo phong cách hiện đại, được tranh bị đầy đủ tiện nghi. Mỗi phòng đều có góc view đẹp, tạo cảm giác thoải mái, dễ chịu và thư giãn khi nghỉ ngơi. Ngoài ra, Night Sea Hotel còn hỗ trợ bãi đậu xe rộng rãi, giúp du khách dễ dàng đậu đỗ xe mà không phải mất phí đậu xe khi đi du lịch tại Phú Quốc.Nadine Phu Quoc Resort là một trong số những resort hàng đầu tại Phú Quốc. Nổi bật và gây ấn tượng với du khách với không gian phòng nghỉ theo thiết kế hiện đại, sang trọng, đầy đủ tiện nghi, giúp cho chuyến du lịch của bạn thêm phần hoàn hảo."));
        return blog_models;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blog, container, false);
    }
}