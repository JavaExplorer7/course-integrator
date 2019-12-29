package course;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

import course.data.CourseDetailRepository;
import course.data.CourseRepository;
import course.data.StaffRepository;
import course.data.UserRepository;
import course.domain.Course;
import course.domain.User;
import course.misc.CompilerCourse;
import course.domain.Course.Type;
import course.domain.CourseDetail;
import course.domain.Staff;
import course.domain.Staff.Position;

@Profile("!prod")
@Configuration
public class DevelopmentConfig {

  @Bean
  public CommandLineRunner dataLoader(CourseRepository repo,
      UserRepository userRepo, PasswordEncoder encoder,
      CourseDetailRepository detailRepo, StaffRepository staffRepo) {
    // user repo for ease of testing with a built-in user
    return new CommandLineRunner() {
      @Override
      public void run(String... args) throws Exception {
        userRepo.save(new User("jacob", encoder.encode("password")));
        
        staffRepo.save(new Staff("eg1", "Smith Johnson", "sj@cqu.edu.cn", Position.INSTRUCTOR));
        staffRepo.save(new Staff("eg2", "Alex Banks", "ab@cqu.edu.cn", Position.CA));
        staffRepo.save(new Staff("eg3", "Alice Jackson", "aj@cqu.edu.cn", Position.CA));
        
        detailRepo.save(new CourseDetail(CompilerCourse.ID, 
            CompilerCourse.TITLE, CompilerCourse.DESCRIPTION, 
            staffRepo.findByIdContaining("eg"), CompilerCourse.getInfo(), 
            CompilerCourse.getGrading(), CompilerCourse.getTasks()));
        
        repo.save(new Course("SE10001", "Freshman Seminar", Type.MF, 1.0, 16, 0, 1));
        repo.save(new Course("SE10003", "Intro to Information System", Type.MF, 2.0, 32, 0, 1));
        repo.save(new Course("SE11005", "Intro to Programming", Type.MF, 4.0, 56, 16, 1));
        repo.save(new Course("SE10009", "Discrete Mathematics", Type.MF, 3.0, 48, 0, 2));
        repo.save(new Course("SE21007", "Object-Oriented Programming", Type.MF, 3.0, 40, 16, 2));
        repo.save(new Course("SE21011", "Computer Architecture", Type.MF, 3.0, 40, 16, 3));
        repo.save(new Course("SE21013", "Data Structure & Algorithm", Type.MF, 3.0, 40, 16, 3));
        repo.save(new Course("SE21017", "Database Principle & Design", Type.MF, 3.0, 40, 16, 4));
        repo.save(new Course("SE21019", "Computer Network", Type.MF, 3.0, 40, 16, 4));
        repo.save(new Course("SE21021", "Operating System", Type.MF, 3.0, 40, 16, 4));
        repo.save(new Course("SE21101", "Theory of Software Engineering", Type.MC, 2.0, 28, 8, 4));
        repo.save(new Course("SE30103", "Software Requirements Analysis", Type.MC, 2.0, 32, 0, 5));
        repo.save(new Course("SE31105", "Object-Oriented Technology & UML", Type.MC, 2.0, 28, 8, 5));
        repo.save(new Course("SE31107", "Web Development", Type.MC, 2.0, 24, 16, 5));
        repo.save(new Course("SE30109", "Software Project Management", Type.MC, 2.0, 32, 0, 6));
        repo.save(new Course("SE31111", "Software Architecture & Design Pattern", Type.MC, 2.0, 28, 8, 6));
        repo.save(new Course("SE31113", "Software Testing", Type.MC, 2.0, 24, 16, 6));
        repo.save(new Course("SE21015", "Assembly Language", Type.MO, 2.0, 24, 16, 3));
        repo.save(new Course("SE20025", "Professional English Writing", Type.MO, 2.0, 32, 0, 4));
        repo.save(new Course("SE21023", "Java EE Programming", Type.MO, 2.0, 24, 16, 4));
        repo.save(new Course("SE30501", "Information Security", Type.MO, 2.0, 32, 0, 5));
        repo.save(new Course("SE31029", "dot NET Framework & C# Programming", Type.MO, 2.0, 24, 16, 5));
        repo.save(new Course("SE31207", "Multimedia Technology", Type.MO, 2.0, 24, 16, 5));
        repo.save(new Course("SE31209", "DirectX Graphics Programming", Type.MO, 2.0, 24, 16, 5));
        repo.save(new Course("SE31311", "Theory of Big Data Engineering", Type.MO, 2.0, 28, 8, 5));
        repo.save(new Course("SE31313", "Machine Learning", Type.MO, 2.0, 28, 8, 5));
        repo.save(new Course("SE31401", "Embedded Architecture", Type.MO, 3.0, 32, 32, 5));
        repo.save(new Course("SE30315", "Financial Software & Service", Type.MO, 1.0, 16, 0, 6));
        repo.save(new Course("SE31031", "Compilers", Type.MO, 2.0, 24, 16, 6));
        repo.save(new Course("SE31033", "Digital Image Processing", Type.MO, 2.0, 28, 8, 6));
        repo.save(new Course("SE31213", "Digital Animation & Game Design", Type.MO, 3.0, 36, 24, 6));
        repo.save(new Course("SE31303", "Data Warehouse & Data Mining", Type.MO, 2.0, 28, 8, 6));
        repo.save(new Course("SE31305", "Mobile Application Development", Type.MO, 2.0, 24, 16, 6));
        repo.save(new Course("SE31403", "Embedded System Design", Type.MO, 3.0, 32, 32, 6));
        repo.save(new Course("SE31309", "Geographical Information System", Type.MO, 2.0, 24, 16, 7));
        repo.save(new Course("SE20201", "Creative Planning for Digital Works", Type.U, 2.0, 32, 0, 3));
        repo.save(new Course("SE21203", "Digital Photography", Type.U, 2.0, 24, 16, 3));
        repo.save(new Course("SE20205", "Color & Plane Composition", Type.U, 2.0, 32, 0, 4));
        repo.save(new Course("SE31027", "Computer Graphics", Type.U, 3.0, 40, 16, 5));
        repo.save(new Course("SE31211", "Human-Computer Interaction", Type.U, 2.0, 24, 16, 6));
        repo.save(new Course("SE31307", "Computing Service & Application", Type.U, 2.0, 28, 8, 7));
        repo.save(new Course("SE24061", "Programming Practice", Type.P, 3.0, 0, 0, 2));
        repo.save(new Course("SE25012", "Data Structure & Algorithm Course Design", Type.P, 1.0, 0, 0, 3));
        repo.save(new Course("SE25018", "Database Course Design", Type.P, 1.0, 0, 0, 4));
        repo.save(new Course("SE34063", "Software Engineering Practice", Type.P, 3.0, 0, 0, 6));
        repo.save(new Course("SE34065", "Software Production Internship", Type.P, 5.0, 0, 0, 7));
        repo.save(new Course("SE44067", "Graduation Internship", Type.P, 5.0, 0, 0, 7));
        repo.save(new Course("SE45099", "Graduation Design", Type.P, 15.0, 0, 0, 8));
        repo.save(new Course("CST30103", "Information Security", Type.U, 3.0, 40, 8, 0));
        repo.save(new Course("CST31117", "Compilers", Type.MC, 3.5, 48, 8, 0));
        repo.save(new Course("PSS12010", "PE Health Knowledge", Type.PFC, 1.0, 32, 0, 0));
        repo.save(new Course("PSS12020", "PE (Swimming)", Type.PFC, 1.0, 32, 0, 0));
        repo.save(new Course("PSS22034", "PE (Table Tennis)", Type.PFC, 1.0, 32, 0, 0));
        repo.save(new Course("PSS22039", "PE (Tennis)", Type.PFC, 1.0, 32, 0, 0));
        repo.save(new Course("PSS22040", "PE (Running)", Type.PFC, 1.0, 32, 0, 0));
        repo.save(new Course("EUS10011", "English I", Type.PFO, 2.0, 32, 0, 1));
        repo.save(new Course("EUS10021", "English II", Type.PFO, 2.0, 32, 0, 2));
        repo.save(new Course("EUS10031", "English III", Type.PFO, 2.0, 32, 0, 3));
        repo.save(new Course("EUS10041", "English IV", Type.PFO, 2.0, 32, 0, 4));
        repo.save(new Course("EUS10111", "Oral English I", Type.PFO, 1.0, 16, 0, 1));
        repo.save(new Course("EUS10121", "Oral English II", Type.PFO, 1.0, 16, 0, 2));
        repo.save(new Course("EUS10131", "Oral English III", Type.PFO, 1.0, 16, 0, 3));
        repo.save(new Course("EUS10141", "Oral English IV", Type.PFO, 1.0, 16, 0, 4));
        repo.save(new Course("EDS20801", "Business English", Type.PFO, 2.0, 32, 0, 0));
        repo.save(new Course("EDS20803", "Study Skill", Type.PFO, 2.0, 32, 0, 0));
        repo.save(new Course("MTH10012", "Higher Mathematics I", Type.PFC, 5.0, 80, 0, 1));
        repo.save(new Course("MTH10022", "Higher Mathematics II", Type.PFC, 6.0, 96, 0, 2));
        repo.save(new Course("MTH10032", "Linear Algebra II", Type.PFC, 3.0, 48, 0, 1));
        repo.save(new Course("MTH20041", "Probability & Statistics I", Type.PFC, 3.0, 48, 0, 3));
        repo.save(new Course("MTH31922", "Database Principle", Type.PO, 3.0, 32, 16, 0));
        repo.save(new Course("PYS10013", "College Physics", Type.PFC, 3.5, 56, 0, 2));
        repo.save(new Course("PYS12010", "College Physics Experiment", Type.PFC, 1.5, 0, 48, 2));
        repo.save(new Course("MET11000", "Military Class", Type.PFC, 2.0, 36, 0, 1));
        repo.save(new Course("IPT10000", "Situation & Policy I", Type.PFC, 0.5, 8, 0, 1));
        repo.save(new Course("IPT10001", "Situation & Policy II", Type.PFC, 0.5, 8, 0, 2));
        repo.save(new Course("IPT20000", "Situation & Policy III", Type.PFC, 0.5, 8, 0, 3));
        repo.save(new Course("IPT20001", "Situation & Policy IV", Type.PFC, 0.5, 8, 0, 4));
        repo.save(new Course("IPT10100", "Moral Cultivation & Basic Law", Type.PFC, 2.0, 32, 0, 1));
        repo.save(new Course("IPT10200", "Contemporary Chinese History", Type.PFC, 2.0, 32, 0, 2));
        repo.save(new Course("IPT10300", "Principles of Marxism", Type.PFC, 3.0, 48, 0, 4));
        repo.save(new Course("IPT10400", "Theory of Chinese Socialism", Type.PFC, 3.0, 48, 0, 3));
        repo.save(new Course("IPT13100", "Moral Cultivation & Basic Law Practice", Type.P, 1.0, 0, 0, 1));
        repo.save(new Course("IPT13400", "Theory of Chinese Socialism Practice", Type.P, 3.0, 0, 0, 3));
        repo.save(new Course("IPG00001", "Innovative Thinking", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00003", "Mathematical Model", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00004", "Innovative Practice of Electro-mechanical Control", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00007", "Career Planning for Undergraduates", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00008", "Career Guidance & Development of Higher Education", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00009", "Entrepreneurial Management", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00010", "Exploring Robot", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00011", "Communication Formula", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG00012", "The Art & Technology of Film Sound", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("IPG01002", "Mathematical Laboratory", Type.C, 2.0, 30, 12, 0));
        repo.save(new Course("IPG01006", "Innovative Spirit & Practice", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00001", "Engineering Management", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00002", "Mathematics, Logic & Language", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00003", "Statistics & Social Life", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00004", "Mathematical Thinking & Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00005", "Material Science & Human Civilization", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00006", "Energy & Sustainable Development", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00007", "Perception of Power in the World", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00008", "Information Communication & the World", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00009", "IoT in Social Life", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00010", "New Technology of Mobile", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00012", "Culture of Geoscience Landscape", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00013", "Structure in Architecture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00014", "Theory & Practice of Sustainable Development", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00015", "Intro to Green Building", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00016", "Intro to Urban Ecology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00017", "Chemistry & Life", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00018", "Life Science & Human Civilization", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00019", "The Comprehension of Life Science", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00020", "Climate Change & Low Carbon Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00021", "Intro to Cleaner Production", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00022", "Physics & New Technology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00023", "History of Drug Discovery", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00024", "Technology of New Energy Auto", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00025", "Life & Ecology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00027", "Intro to Food Safety", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00028", "Building & City Intelligence", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("STG00036", "Java & Android App Development", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00001", "Ethics & Life", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00002", "Logics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00003", "Philanthropy & Social Development", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00004", "Principles of Economics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00005", "Public Policy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00006", "Social Psychology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00007", "Intro to Economics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00008", "Information Literacy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00009", "Business Negotiation & Communication", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00010", "Entrepreneurship", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00011", "Engineering Economics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00012", "Politic Science", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00013", "Intro to Sociology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00014", "International Issues & Laws", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00015", "Laws & Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00016", "Venture & Contract", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00017", "Labor Dignity & Rights Protection", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00018", "Contemporary Quality Management", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00019", "Rural & Modern", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00020", "Japan's Politics & Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00021", "Sociology in Life", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00022", "Social Research Methodology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00023", "Anthropology in Cross-cultural Comparison", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00025", "Philanthropy & Anthropology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00026", "Food & Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00027", "Classic Reading to Historical Anthropology", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00028", "Europe & European Union", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00030", "Logical Deduction & Policy Analysis", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00031", "Government & Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00032", "Entreprise Law Risk Management", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00033", "Mental Health & Growth of College Students", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00034", "Communication & Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00035", "Cultural Heritage & Law", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("SSG00036", "Diaspora Study in Globalization", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00001", "Interptetation of Traditional Chinese Classics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00002", "The History of Western Philosophy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00003", "Selected Readings in Shakespeare's Drama", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00004", "Computer-assisted Writing of Chinese Classic Poetry", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00005", "Global Literacy & Intercultural Communication", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00006", "The History of China Arts & Works Appreciation", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00007", "Foreign Art History & Works Appreciation", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00008", "Creation of Paintings & Appreciation of Art", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00009", "Music & Psychological Adjustment", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00010", "Film Aesthetics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00011", "The History of Chinese Film Art", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00012", "Media Creativity", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00013", "Media Literacy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00014", "Reading Cities & Buildings", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00015", "Guided Reading of the Analects of Confucius", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00016", "Guided Reading of ZiZhi TongJian", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00017", "Ancient Chinese Thought & Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00018", "Researches on Chinese Culture History", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00021", "Guided Reading of Plato's Republic", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00022", "Chinese History & Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00023", "Love & Justice: An Intro to Law & Literature", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00024", "Guided Reading of Modern Philosophy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00025", "Guided Reading of ShiShuo XinYu", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00026", "Selected Readings of Utopian Works", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00027", "Homeric Epics", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00028", "Intro to Literature & Critical Theory", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00029", "Intro to Movie & Critical Theory", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00030", "Literature & History in Modern China", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00031", "Gender/Sexuality & History", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00032", "Classic Fictions of Ming and Qing Dynasties", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00037", "Review of Rural China and Rural Narrative", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00038", "American History & Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00039", "An Intro to Mass Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00040", "Su Shi's Literature and Culture in Song Dynasty", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00041", "Knowing More about Tao Yuanming", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00042", "A Reading Guide to Western Literature", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00043", "Guide Reading of the ZhuangZi", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00044", "History of Ancient Chinese Food", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00045", "The Mysterious Culture in Ancient China", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00046", "College Chinese Literature I", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00047", "College Chinese Literature II", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00048", "Zuo Zhuan Introduction", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00049", "Mencius: An Introduction", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00050", "Intro to the Thoughts of Pre-Qin Philosophers", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00051", "Environment and the Human Society in History", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00052", "The Silk Road & the Spread of Buddhism", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00053", "Chinese and Foreign Tibetlogy", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00054", "Intro to the History of Tibet and Tibetan Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00055", "Language & Society", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00056", "Chinese Folk Art", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00057", "Reading and Appreciating Instrumental Music Works", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00058", "Photography Art Creation and Aesthetic", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00059", "Intro to Arts", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00060", "Writing", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00061", "Film Art and Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00062", "German Manufacture and Innovation", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00063", "Russian History and Culture", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00064", "Intro to Four Books", Type.C, 2.0, 32, 0, 0));
        repo.save(new Course("HG00065", "Film-language & Short Film-making", Type.C, 2.0, 32, 0, 0));
        
        }
      };
    }

}
