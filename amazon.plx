#!/usr/bin/perl
use WWW::Mechanize; 
use LWP::Debug qw(+); 

$username = "txdywy"; 
$password = "wytxdywy"; 

my $mech = WWW::Mechanize->new(); 

   $mech->cookie_jar(HTTP::Cookies->new()); 
   $mech->get( "https://us-amazon.icims.com/jobs/submittal" ); 
    
   #Get ADMIN-ID 
   $mech->content() =~ /name=\"ADMIN\" value=\"([^\"]+)/g; 
   $hiddenField = $1; 
       
   #Fill form 
   $mech->submit_form( 
                 form_name => "action", 
                   fields      => { 
                     ADMIN => $hiddenField, 
                     username   => $username, 
                     password => $password}, 
                   button => 'login'); 

    #Print site            
   print $mech->content(); 
print $content,"\n";
