package com.example.myapplication;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemMenuBinding;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class menuAdapter extends RecyclerView.Adapter<menuAdapter.menuViewHolder>{
    public static class menuViewHolder extends RecyclerView.ViewHolder {
        ItemMenuBinding binding;
        public menuViewHolder(ItemMenuBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
    private final ArrayList<itemMenu> menuArr;
    public menuAdapter(ArrayList<com.example.myapplication.itemMenu> menuArr) {
        this.menuArr = menuArr;

    }
    private static final List<Question> dialyde = new ArrayList<>(Arrays.asList(
            new Question("Tỉnh Nghệ An có diện tích nhỏ nhất?", true),
            new Question("Nước ta có 50 tỉnh?", false),
            new Question("Côn đảo thuộc Bà Rịa Vũng Tàu?", true),
            new Question("Phú Quốc thuộc Kiên Giang?", true),
            new Question("Trường sa thuộc Quảng Nam?", false)

    ));
    private static final List<Question> dialytb = new ArrayList<>(Arrays.asList(
            new Question("Địa hình chủ yếu của Tây Nguyên là Cao Nguyên?", true),
            new Question("Tây Nguyên chỉ có 5 cao nguyên đúng hay sai?", false),
            new Question("Khí hậu Tây Nguyên có 2 mấy mùa?", true),
            new Question("Vùng đặc quyền kinh tế thuộc vùng biển nước ta có chủ quyền hoàn toàn về kinh tế", true),
            new Question("Vùng lãnh hải của nc ta nằm phía ngoài đg cơ sở", true)

    ));
    private static final List<Question> dialykho = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));

    private static final List<Question> lichsude = new ArrayList<>(Arrays.asList(
            new Question("Hiện thực lịch sử là tất cả những điều đã diễn ra trong quá khứ, tồn tại một cách khách quan, độc lập?", true),
            new Question("Nước Văn Lang ra đời 70 TCN?", false),
            new Question("NƯỚC ÂU LẠC RA ĐỜI 218 TCN?", true),
            new Question("Hà Nội là thủ đô của Việt Nam?", true),
            new Question("Trang phục truyền thống của người con gái Việt Nam là áo phông?", false)

    ));
    private static final List<Question> lichsutb = new ArrayList<>(Arrays.asList(
            new Question("Đất nước Việt Nam được chia thành 3 vùng (miền) chính?", true),
            new Question("Bảng chữ cái Tiếng Việt gồm 28 chữ cái?", false),
            new Question("Tiếng Việt gồm 5 thanh điệu?", false),
            new Question("Tết Nguyên Đán là Dịp lễ quan trọng và ý nghĩa nhất tại Việt Nam?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> lichsukho = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> sinhhocde = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> sinhhoctb = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> sinhhockho = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> toanhocde = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> toanhoctb = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));
    private static final List<Question> toanhockho = new ArrayList<>(Arrays.asList(
            new Question("đường biên giới trên đất liền của nc ta chủ yếu đi qua miền núi?", true),
            new Question("đặc điểm nổi bật của địa hình nc ta nhiều nhất là sơn nguyên?", false),
            new Question("vùng nội thủy của biển nc ta bao gồm các quần đảo ở xa bờ?", false),
            new Question("dải đồi trung du hẹp nhất nc ta nằm ở rìa đồng bằng ven biển miền trung?", true),
            new Question("đặc điểm nổi bật của biển đông là nằm trong vùng ôn đới?", false)

    ));

    @NonNull
    @Override
    public menuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        ItemMenuBinding binding = ItemMenuBinding.inflate(inflate,parent,false);
        return new menuViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull menuViewHolder holder, int position) {
        itemMenu itemmenu = menuArr.get(position);
        if(itemmenu == null) return;
        holder.binding.imageView.setImageResource(itemmenu.getIdImage());
        holder.binding.textTopic.setText(itemmenu.getTopic());
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Id = holder.getAdapterPosition();
                Bundle bundle = new Bundle();
                if(Id ==0){
                    bundle.putParcelableArrayList("de", (ArrayList<? extends Parcelable>) toanhocde);
                    bundle.putParcelableArrayList("tb", (ArrayList<? extends Parcelable>) toanhoctb);
                    bundle.putParcelableArrayList("kho", (ArrayList<? extends Parcelable>) toanhockho);
                }
                if(Id ==1){
                    bundle.putParcelableArrayList("de", (ArrayList<? extends Parcelable>) dialyde);
                    bundle.putParcelableArrayList("tb", (ArrayList<? extends Parcelable>) dialytb);
                    bundle.putParcelableArrayList("kho", (ArrayList<? extends Parcelable>) dialykho);
                }
                if(Id ==2){
                    bundle.putParcelableArrayList("de", (ArrayList<? extends Parcelable>) lichsude);
                    bundle.putParcelableArrayList("tb", (ArrayList<? extends Parcelable>) lichsutb);
                    bundle.putParcelableArrayList("kho", (ArrayList<? extends Parcelable>) lichsukho);
                }
                if(Id ==3){
                    bundle.putParcelableArrayList("de", (ArrayList<? extends Parcelable>) sinhhocde);
                    bundle.putParcelableArrayList("tb", (ArrayList<? extends Parcelable>) sinhhoctb);
                    bundle.putParcelableArrayList("kho", (ArrayList<? extends Parcelable>) sinhhockho);
                }
                Navigation.findNavController(v).navigate(R.id.action_menuFragment_to_selectLevelFragment2, bundle);
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuArr.size();
    }
}
