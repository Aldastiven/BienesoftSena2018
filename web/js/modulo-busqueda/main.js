
$(document).ready(function(){
    
    $(".modal-container").hide();
    $(".btn-search-close").hide();

    $(".btn-search-principal").click(function (){
        $(".btn-search-principal").hide();
        $(".btn-search-close").show();
        $(".modal-container").show();
    });
    
    $(".btn-search-close").click(function (){
        $(".btn-search-principal").show();
        $(".modal-container").hide();
        $(".btn-search-close").hide();
    });
    
});
