# semester5k
- Opgavebeskrivelse
https://docs.google.com/document/d/1druj0wX1JdYzTP9jwNiLd8FyuFndSpOKfOykJGdc77w/edit?usp=sharing
# Software design
- Use case
https://docs.google.com/document/d/1D6yZhAuvAsTn0rYSFte0JHNDCjE3MFYeEYbpEbjREtY/edit?usp=sharinglink.dk
- Nouns & verbes
https://docs.google.com/document/d/1FdKMifI8vwAUyv3opXDwYIv2L4Sz07yHYVXCjYlaJcQ/edit?usp=sharing
- Furps+
https://docs.google.com/document/d/1AYZYQ3HRqcVONZlMWODoIzCzZSlN0B8SBFUdLh1nfk8/edit?usp=sharing
- Kanban
https://trello.com/b/qzizBT7h/5k-semesterprojekt
- Use case diagram
https://drive.google.com/file/d/1sk_Jc5Po04ytgcV0-dcdpC0GtFKnBuQx/view?usp=sharing
- Domain model
https://drive.google.com/file/d/1z6_Xqqnjh4qO68_sg6L0mStS81mJwc-l/view?usp=sharing
- Class diagram
https://drive.google.com/file/d/1N8zYo3anNIBvI3Sak3QscIVlwwU0Eyny/view?usp=sharing
# SSD
- SSD Login
https://drive.google.com/file/d/14bCRw2Uz8SSSm3VoEdxTTaAcpf1_KQ1p/view?usp=sharing
- SSD Change password
https://drive.google.com/file/d/1nKxQme6-QXktejLlhKdXafpUnxy1LvjW/view?usp=sharing
- SSD Create new member
https://drive.google.com/file/d/1IwCltab7sxVQXNkBEzDBAbuMM1ILI8II/view?usp=sharing
 
# SD
- Sequence diagram regTime()
https://drive.google.com/file/d/1i-WxN2_y4Vc0piCDfyN_18QW4QwyduAt/view?usp=sharing
- Sequence diagram regTime() & code
https://drive.google.com/file/d/1TLX97wNexkZoW8kz3SfyvBHK9k8NSDMl/view?usp=sharing

- Sequence diagram adminMember() & code
https://drive.google.com/file/d/1J3cxIGt6nhmqDS5V_HOkF6q4h0M1_QqU/view?usp=sharing

- Sequence diagram addMember() & code


- Sequence diagram antiJarl() & code


- Sequence SAMLET
https://drive.google.com/file/d/18wiF2wrOyOZ4fhWSnJCJ9AElFYrAXW6k/view?usp=sharing

# ITO
- Intressent analyse
https://docs.google.com/document/d/1qEfOZq0VvmBkU646ZinrUicPRx07zQKGiZ3cottVqCY/edit
- Swot analyse
https://drive.google.com/file/d/1hpGo2npJPPaDvuTuUniG1n8xz4zpFteu/view
# Metode navne:
# User:
- <<constructor>>
- Trainer(String username, String password);
- setPassword(String password);
- setUsername(String username);
- getUsername();
- getPassword();
- getTrainer();
- getCashier();
- getAdmin();
- setTrainer();
- setCashier();
- setAdmin(); 
# Members:
- <<constructor>>
- Members(int, String, boolean, boolean, boolean);
- getBackTime();
- getCrawlTime();
- getBreastTime();
- getAge();
- getName();
- getActive();
- getCompetetive
- getPayed(); 
- getBackChosen();
- getCrawlChosen(); 
- getBreastChosen();
- setAge(int);
- setName(String);
- setActive(boolean); 
- setCompetetive(boolean);
- setPayed(boolean);
- setBackChosen();
- setBackUnChosen();
- setBreastChosen();
- setBreastUnChosen();
- setCrawlChosen();
- setCrawlUnCHosen();
- addCrawlTime(double);
- addBackTime(double);
- addBreastTime(double);
 # interface Disciplin:
- public void addTime(double);
- public void setChosen();
- public void setUnChosen();
- public ArrayList<Double> getTime();
- public boolean getChosen();
# Back, Crawl, Breast implements disciplin 
# Menu:
- addMember();
- adminMemberMenu();
- menuPromptStart();
- MemberListMenu();
- TimeMenu();
- MenuCase();
- TrainerCase();
- AdminCase();
- CashierCase();
- TimeCase();
- MemberCase();
- addTimeMenu();
- regTime();
- saveMembers();
- saveBreast();
- saveCrawl();
- saveBack();
- fillBack();
- fillBreast();
- fillCrawl();
- fillMembers();
- fillDivList();
- viewBreastTimes();
- viewCrawlTimes();
- viewBackTimes();
- viewCompetetive();
- viewActive();
- viewArrears();
- viewAllMembers();
- viewBackSwimmers();
- viewCrawlSwimmers();
- viewBreastSwimmers();
- adminMember();
- login();
- antiJarl();
- antiJarlDouble();
- ChangedPassword();
- restart(); 
 
