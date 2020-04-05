package com.example.siagakorona;

import java.util.ArrayList;

public class RumahSakitData {
    private static String[] rsNames = {
            "RSUP H. Adam Malik",
            "RSU Djasamen Saragih",
            "RSU Padang Sidempuan",
            "RSU Kabanjahe",
            "RSUD Tarutung",
            "RSUP dr. M. Djamil",
            "RSU Achmad Mochtar",
            "RSU Arifin Achmad",
            "RSUD Kota Dumai",
            "RSUD Puri Husada Tembilahan"
    };

    private static String[] rsDetails = {
            "Jl. Bunga Lau No.17, Kemenangan Tani, Kec. Medan Tuntungan, Kota Medan, Sumatera Utara 20136",
            "Jl. Sutomo No.230, Simalungun, Kec. Siantar Sel., Kota Pematang Siantar, Sumatera Utara 21121",
            "JL. Dr. F.L. Tobing, Kantin, Padangsidimpuan Utara, Kota Padang Sidempuan, Sumatera Utara 22719",
            "Jl. Selamat Ketaren No.08, Lau Cimba, Kabanjahe, Kabupaten Karo, Sumatera Utara 22111",
            "Jalan Agus Salim No.1, Hutagalung Siwaluompu, Tarutung, Kabupaten Tapanuli Utara, Sumatera Utara 22411",
            "Jl. Perintis Kemerdekaan, Sawahan Tim., Kec. Padang Tim., Kota Padang, Sumatera Barat 25171",
            "Jl. Dr. Abdul Rivai No.1, Bukit Apit Puhun, Kec. Guguk Panjang, Kota Bukittinggi, Sumatera Barat 26122",
            "Jl. Diponegoro No.2, Sumahilang, Kec. Pekanbaru Kota, Kota Pekanbaru, Riau 28156",
            "Jl. Tj. Jati No.4, Buluh Kasap, Dumai Tim., Kota Dumai, Riau 28812",
            "Jl. Veteran No.52, Tembilahan Hilir, Tembilahan, Kabupaten Indragiri Hilir, Riau 29281"
    };

    private static int[] rsImages = {
            R.drawable.adam_malik,
            R.drawable.djasamen_saragih,
            R.drawable.padang_sidimpuan,
            R.drawable.keban_jahe,
            R.drawable.tarutung,
            R.drawable.m_djamil,
            R.drawable.achmad_mochtar,
            R.drawable.arifin_ahmad,
            R.drawable.dumai,
            R.drawable.puri_husada
    };

    static ArrayList<RumahSakit> getListData() {
        ArrayList<RumahSakit> list = new ArrayList<>();
        for (int position = 0; position < rsNames.length; position++) {
            RumahSakit rs = new RumahSakit();
            rs.setName(rsNames[position]);
            rs.setDetail(rsDetails[position]);
            rs.setPhoto(rsImages[position]);
            list.add(rs);
        }
        return list;
    }
}
