namespace java com.crls.thrift.message
namespace py message.api

service MessageService{
    bool sendEmailMessage(1:string email,2:string message)
}