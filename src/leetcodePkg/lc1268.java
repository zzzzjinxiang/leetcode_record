package leetcodePkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lc1268 {

    public static void main(String[] args) {
        String[] products = {"tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunqerptgas","zmmirsxdhyxvmdybjzondyvrkzeafhvualsivfueweuusmsxbttdeofzeripaqv","tyqcpfvorznmxxdzepfxabibcagilwjsqncxnpjqsxjzqqqbae","tyqcpfvacyrjvmadrmntxotgvgivdvcuwygpjfwcuppunolukrum","tyqcpfvrqwrcpusmfyhxaiasfbb","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqyalwiaj","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchidnpt","lfjkcljnd","zibrwfpwecubjlsjbkrhnvolnnzrqhdynloplzagwnuhpxhbvpxnqaifnln","ybswoottdgryxtupichpvqjmcoytrwnfgzrrnaejojvpzmttlzw","tyqcplghosxjviooiyddhvzzrhuuwkiosmgafxyajcdyqlmthqkoylxhtxdruw","okoscfpxcndzgbtsozdofgnomtglmoaewgzzjvrxezoq","cxkwvaytkxgafeltbanhsvxlorigkuxnsxlmhvwqm","iamtabcpdagicnvdvqcfykonsazrbdivxtczpgqgxjrifukmqjw","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbneryahanhrhkal","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunl","tyqcpfvorznmxxdzsuyushueegfrnlzbydnefcfagqnxglkulegntoml","zlovtmburfkd","vlzfaamutsfqefpafzffwhvpfw","bbufxzwpryyakbxuhwwplvdptgybbykqxirsrahsokviihxrawcbgwrktvgacmwtc","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbzw","kjundphljswl","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqhlqnapfkcqpdb","stcphvgxvcaysehvrfdfllwvxf","epbtkgnnupbbdqgheyaks","gilhnlfkdz","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwghy","yswdsvnzucvsdzrmeghevjrfuhoebfedvyvortaxppwqncmspctdcjlwdxfnc","baizdtmgozykukcrkapsnp","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgcsfjgtwqqubbhjkzmio","iblyydfzztmtyjmgrxvyjwcobfyxcgyrbtnfhhxswxahze","tyqcpfyggtmjahhpjzwhohvchyofsxwkehq","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniaymgkdduoabmp","gpsqlqorcbqffdxlnijgvzvxilnbkynwscuoymqyg","eidradnaqjwmucbrgtp","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzopnqxxcxshbhdmippldmcuxlvc","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbfmryrbgicgzqecje","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuze","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqandxbuvshebs","tyqcqqxonxtwakxlrceyknbockvovdwumbjkfrgmudiafbqlflonfavpsrfq","tyqcpfvorznmxxdzsnkjnrrzpfourbghe","ziarqmfvzqpqhunfxwfwjtetotozkjaszznbtrvtxarysaxq","tyqcpfvorznmxfmlzlcuikpxvahtfbfipjcgmeusshufvnirwcopdnvnop","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvdertpdpdjsngezrnyjxotgonuigmqkgipgb","tyqcpfvorznmxxdzsnkjnrrzpfvfcvufmzzuqrjubsfzp","tyqcpfvorznmxxdzsnkjnrrzpfgknvqorqffebhoyfvgkspenqpcmvoxpybkjg","oqojrvinnhlwuqllcsabkpfiusfucpjbsxzzhlgduawaqyp","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviaxsw","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqnzudhzclswotlbgdffwiekw","csgadyglxddodloklsegvsbtgtkloklmxkbxxyorcqwybktuzpyeaqasn","tyqitegmijccjwxuwvchbvuvllmgsdugzxdkiqvnllhmsjyskxpzzds","tyqcpfvorznigwmavbguxwhunsshdybhzszxvlnpingqgaghkqzeynbbbhgcxeydir","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunflh","tyqcpfvorznmbwmhfmudnurhismirfgvojpdmclw","tyqcpfvjijiwoup","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejemb","tyqcpfvorznmxxdzsnkjhvabtzucyooctzzrgehlsuyinrrnzjilfpalvqgwoey","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvie","tyqcpfvorznmxxxvjwfgcwegpibuifhfxyomnicutaegshpnschktxknqytritr","tyqcpfvorznetvhiaobezckojwjbeg","tyqcpfvorzmjabuccipqln","frutebajqddrtrsmabfmdcgipssymldwscxbbrbpb","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvqi","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchxeyrnlh","yaxaddctugikoutgcwqsdekghoemtooljxvysnzqqvgpc","tyqcpfvorznmxxdzsnkjn","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqggjwxdvqesbgrqei","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckoktdj","mzwjshgbgbdogqbrhfgbjkrqogyynbdwwkdclsbpynlrhxeucuuo","tyqcpfvorznmxxdzsnkjnrrztrqgpbvvxm","u","tyqcpfvorznmxjnsgyirdtzpwywpnrvgadkmdjghlmerbqysaebyge","tyqcpfvorznmxxdzsnkjnrkjelwoqorxsnyjqdnxfava","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvqqy","hcav","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviof","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwreznx","yesupowwycvcdbknhrkfyvnpoqtdhcbhybqvhnvgukoohh","hcvlnbmcrepblcqrvwpfsyevlpyldptubnxkntqhpounxjcw","lwaxzivycjkanvikqpbrvdvjkaclyuyfitwfycsnfwjg","tkruiswrcbzsbkwbhhvjzzuuiayqzbxjosjssacislcvbtcojpmyatkfgyx","ftujoohzvjonlwxwskeydoxpfvbvrdndbhgpuvykif","tyqcpfvorznmxxdzsnkjnrrzpfgknvqqngbpbdtufkgunalbekxbkpajlgbjtqmswh","tyqcpfvorznmxxdzsnkjnrrzpewgvvnicz","tyqcpfvorznmxxdzsnkjnrrzpfgknjxnepksgdzwxsbziwdzsiiyarxhtpp","jumcvboxaxjfybdlezcjrarolxjtsuweaigkiudusinfmnczdualqzlpwkm","tyqcpfvoxegnpqesbaugr","bteznmwyh","rtbpifxevchngjnlumvtqtpebgtoznvvrzfxqzmcktoxydbstbvukrunnyeqwfd","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejysfrlewzsgukyahggau","mvrrbfbfwyrxooopgcbwmtjfepejyfrqdkyaqencqqlagoilrtdndfyn","tyqcpfvorznmyrzwhjxvhooytltygrakvgkqumrimazzhzoueyqnjz","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviob","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwoyvqczogovza","tyqcpfvorznmxxdzsnkjnrrzpfgknvfnzshqqfpr","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjghvqg","zqrnaierpnsigujuxrftdiauazddadqmrwcimxyztwumwzyjcrqvuexnitdecfgo","xusxbbilivpovzsjvfsdnacipk","tyqcpfvorznmxxdzkbqgrgeolnwhtvlckmiattpmxwwtmlifnexxbgtpjslwhczrjlhr","eiuytvdzhcodcrdgthxynurtpsdyguupijjluucpfinrfnsjkdbbzexfmctejlgvd","tyqcpfudqjrabwwvdvwmsyscnazaxpsjjhetouegipqevvointclztzummwrrbntjlsj","tyqcpfvobzfvbiuoktjcqjfx","tyqcpfvorznmxxdzsnamc","ajqpomnpmsayhelmhfehjbvjaeszqigfqyuixbtyjy","jpfxangixfavlhcssecxljksydrjxmaldhwpftinywtbmffsmtslefcuddk","txryxhtutwdrqmpcapbcrlmhzsobueefwfekusmmylr","etzqiepphjcleaocnwljcdn","tyqcpfvokfxlbmbzmitacnromkoaoxl","iddmxxcmwecfutbrbqeihhlnypckofuhkbydmljfemzrvlxsuskxkbgviybzu","tyqcpfvorznmxxdzwilcfwrdlfqppdnuvgltuoooppwyomtvtggmsfxsxievdlsyame","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvzquhbkvburnhmerkuabrfcjwanzmfenz","tyqcpqgaus","zsbcqgctsjdjyfkdvcehawsqzacafwtjmhemfygdahkexvmkqkcehvek","tyqcpfvorznmxxdzsnkjfesxjshxtlinfjltdfl","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnubpoqoghhgbpew","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdcuudsuqq","tyqcpgwivyfquxqhbkjbioekqbsd","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnudxocavmwpggka","tyqcpfvorznmxxdzsnkjnrrzpfgknvnlxdokehsjhiohwdeyikeajzipztzhwmxc","pmpoycdxttisazazsgiswnsnhdmejpjbygvtjhwqydeugbouekvornbeiwmpehikbz","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwcpoxr","qmgnrjtavzsqtwareroiihendgcvbzbcolvfoanmixxrxdtnmtevvv","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnunix","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetxpdyhmk","tyqcpfvorznmxxdzsnkjnrfmy","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetaoqgbczdcemzlmqemy","tyqcpfzmlffhifutomuvfvwaqatopvur","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvdvagddprewvlgx","ozmyertmnlwybntwxmpynuynhqdbqhosvjwexzqgvdtnvxexxwwwwhqktmzbfkjfn","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckohyof","rniiqnzbctzeyeeyrxhfzqgbccplsncvtswcrqmevplfzadlulazmpmhdojwaokn","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzakckmtmjxx","tyqcpfvorznmxxdzsnkjnrrzpfgkhdwienfhpsqbyrvotbgchkkmvk","tyqcpfvorznmxxdzsnkjnrrumaqtylptffsjzygeumkahutdmalkqtrhtgrsrqcyyti","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvioncnr","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchvigzpo","tyqcpfvorznmxxdzsnkjnrrzpfgkeduq","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnccdnakfkhtg","lhehmbyzcnlwvr","tyqcpfvojuuprlby","wds","tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqvegfwmtdcrvdb","tyqcpfvorznpkeynkmbbyptclmhxxlyjzejqbcatgfrmkbbmxs","tyqcpfvorznmiqmfrhihxsagizcrwyaukrjwbbgrxdzknq","ghhlssixrouzbqcpmxzmsnybaygtb","jndewk","tyqcpfvorznmxxdzsnkjnrrzpdqanmxattjhgnflnoyynevsxvpbwfmfrnlc"
        };
        String searchWord =  "tyqcpfvorznmxxdzsnkjnrrzpfgknvqvderckuzdqqgaqejetbnuniwwjbdchviotvdticwxwcliylrpvrokbcguhnfvpd";
        for(List x : suggestedProducts2(products, searchWord)) {
            for (Object s : x) {
                System.out.printf("%s-", s);
            }
            System.out.println();
        }
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Collections.sort(Arrays.asList(products));
        String cur = "";
        int j = 0;
        for(int i = 1; i <= searchWord.length(); i++) {
            int mark = -1;
            cur = searchWord.substring(0, i);
            List<String> tmpList = new ArrayList<>();
            while(j < products.length) {
                if(i > products[j].length()) {
                    j++;
                    continue;
                }
                String tmp = products[j].substring(0, i);
                if(tmp.equals(cur)) {
                    if(mark == -1) mark = j;
                    tmpList.add(products[j]);

                }
                if(tmpList.size() == 3)
                    break;
                j++;
            }
            res.add(tmpList);
            if (mark != -1) j = mark;
        }
        return res;
    }

    public static List<List<String>> suggestedProducts2(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        Collections.sort(Arrays.asList(products));
        for(int i = 1; i <= searchWord.length(); i++) {
            List<String> tmpList = new ArrayList<>();
            String cur = searchWord.substring(0, i);
            boolean flag = false;
            String mark = "";
            for(String x: products) {
                if(i <= x.length() && x.substring(0, i).equals(cur)) {
                    tmpList.add(x);
                    if(tmpList.size() == 3)
                        break;
                }
            }
            res.add(tmpList);
        }
        return res;
    }
}
