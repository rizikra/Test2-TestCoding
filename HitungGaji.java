import java.text.DecimalFormat;

class HitungGaji{
    public static void main(String[] args) {
        DecimalFormat def = new DecimalFormat(); //Instansiasi Object

        double Gaji = 0;
		double TunjanganSuamiIstri = 0;
		double TunjanganAnak = 0;
		double IuranPensiun = 0;
		double JumlahAnak = 0;
		double HasilBruto = 0;
		double HasilNetto = 0;
		
        Gaji = 4600897.00;
        JumlahAnak = 4.0;

        // Tunjangan Suami Istri
        TunjanganSuamiIstri = Gaji * 10/100;

        // Tunjangan Anak
        TunjanganAnak = JumlahAnak * (Gaji * 2/100);

        // Hasil Bruto
        HasilBruto = Gaji + TunjanganSuamiIstri + TunjanganAnak;
		
        // Iuran pensiun
        IuranPensiun = Gaji * 4/100;

        // Hasil Netto
        HasilNetto = HasilBruto - IuranPensiun;

        //Output yang Dihasilkan
		System.out.println();
		System.out.println("SLIP GAJI");
		System.out.println();
        System.out.println("Gaji Pokok Per-Bulan             :   Rp. "+ def.format(Gaji));
        System.out.println("Tunjangan Suami/Istri            :   Rp. "+ def.format(TunjanganSuamiIstri));
        System.out.println("Tunjangan Anak                   :   Rp. "+ def.format(TunjanganAnak));
        System.out.println("__________________________________________________________ + ");
        System.out.println("PENGHASILAN BRUTO PER-BULAN      :   Rp. "+ def.format(HasilBruto));
        System.out.println();
        System.out.println("Iuran Pensiun                    :   Rp. "+ def.format(IuranPensiun));
        System.out.println("__________________________________________________________ - ");
        System.out.println("PENGHASILAN NETTO PER-BULAN      :   Rp. "+ def.format(HasilNetto));
    }
}