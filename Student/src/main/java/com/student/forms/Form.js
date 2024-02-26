function updateQualificationId() {
    var instituteSelect = document.getElementById("institute");
    var selectedOption = instituteSelect.options[instituteSelect.selectedIndex];
    var qualificationIdInput = document.getElementById("qualification_id");
  
    var qualificationsMap = {
      "1": "1", 
      "2": "2", 
      "3": "3", 
      "4": "4", 
      "5": "5"  
    };
  
    var selectedInstituteId = selectedOption.value;
    if (qualificationsMap[selectedInstituteId]) {
      qualificationIdInput.value = qualificationsMap[selectedInstituteId];
    } else {
      qualificationIdInput.value = "";
    }
  }
  