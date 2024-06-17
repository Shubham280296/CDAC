# Question_3
class Vehicle_profile:
   def __init__(self, vehicle_name="", vehicle_model="", vehicle_connectivity="", vehicle_owner="", vehicle_features=""):
       self.__vehicle_name = vehicle_name
       self.__vehicle_model = vehicle_model 
       self.__vehical_connectivity = vehicle_connectivity
       self.__vehicle_owner = vehicle_owner
       self.__vehicle_features = vehicle_features
       
   def get_owner(self):
       return self.__vehicle_owner
   def set_name(self, n):
       self.__vehicle_name = n
   def set_model(self, m):
       self.__vehicle_model = m
   def set_connectivity(self, c):
       self.__vehicle_connectivity = c
   def set_owner(self, o):
       self.__vehicle_owner = o
   def set_features(self, f):
       self.__vehicle_features = f
       
   def display_vehicle_details(self):
       return f"vehicle_name: {self.__vehicle_name}.\nvehicle_model: {self.__vehicle_model}.\nvehicle_connectivity_support: {self.__vehicle_connectivity}.\nvehicle_owner: {self.__vehicle_owner}.\nvehicle_features: {self.__vehicle_features}."
   
    

vehicle_list = []

def add_vehicle():
    name = input("Enter vehicle name: ")
    model = input("Enter vehicle model: ")
    connectivity = input("Enter vehicle connectivity: ")
    owner = input("Enter vehicle owner: ")
    features = input("Enter vehicle features: ").split(",")
    for profile in vehicle_list:
        if profile.get_owner() == owner:
            print("Owner already exists. Enter a new owner.")
            name = input("Enter vehicle name: ")
            model = input("Enter vehicle model: ")
            connectivity = input("Enter vehicle connectivty: ")
            owner = input("Enter vehicle owner: ")
            features = input("Enter vehicle features: ").split(",")
            if owner == profile.get_owner():
                return 1
    else:
        vehicle_list.append(Vehicle_profile(name, model, connectivity, owner, features))
        return 2
            
def display_vehicle():
    if len(vehicle_list) == 0:
        print("no vehicles to display.")
    else:
        for vehicle in vehicle_list:
            vehicle.display_vehicle_details()

def update_vehicle():
    owner = input("Enter vehicle owner: ")
    for profile in vehicle_list:
        if profile.get_owner() == owner:
            name = input("Enter vehicle name: ")
            model = input("Enter vehicle model: ")
            connectivity = input("Enter vehicle connectivity: ")
            owner = input("Enter vehicle owner: ")
            features = input("Enter vehicle features: ").split(",")
            vehicle_list.pop(profile)
            vehicle_list.insert(profile.index(), Vehicle_profile(name, model, connectivity, owner, features))
            return 1
    else:
        return 2
            
            
def delete_vehicle():
    owner = input("Enter vehicle owner: ")
    for profile in vehicle_list:
        if profile.get_owner() == owner:
            vehicle_list.remove(profile)
            return 1
    else:
        return 2
    
choice = int(input("""
               1. add new vehicle
               2. display vehicle details
               3. update vehicle details
               4. delete vehicle details
               5. exit
               """))
while choice!=5:
    match choice:
        case 1:
            x = add_vehicle()
            if x == 1:
                print("Abort")
            elif x ==2:
                print("Profile added successfully.")
        case 2:
            x = display_vehicle()
        case 3:
            x = update_vehicle()
            if x == 1:
                print("Profile updated successfully.")
            elif x ==2:
                print("Profile Not found.")
        case 4:
            x = delete_vehicle()
            if x == 1:
                print("Profile deleted successfully.")
            elif x ==2:
                print("Profile Not found.")
        case 5:
            print("Thank you for visiting.")
        case _:
            print("Wrong choice.")
            